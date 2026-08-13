            package p000;

            import java.io.DataInputStream;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public abstract class iOi1OOi {
                public static IIIOOI0O10I I00000oIO(InputStream inputStream) {
/* 3 */             DataInputStream dataInputStream = new DataInputStream(inputStream);
/* 13 */            IooO11l iooO11l = new IooO11l(1, dataInputStream.readInt(), 1);
/* 24 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iooO11l, 10));
/* 27 */            Iterator it = iooO11l.iterator();
/* 36 */            while (((IooO10lI) it).I00iiO) {
/* 41 */                ((IooIlO1) it).nextInt();
/* 52 */                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
                    }
/* 56 */            int[] iArrI00iIO = IOOi0Ool1i.I00iIO(arrayList);
/* 67 */            return new IIIOOI0O10I(Arrays.copyOf(iArrI00iIO, iArrI00iIO.length));
                }
            }
