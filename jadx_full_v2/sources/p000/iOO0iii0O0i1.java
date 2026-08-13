            package p000;

            import android.hardware.camera2.params.InputConfiguration;
            import android.hardware.camera2.params.MultiResolutionStreamInfo;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class iOO0iii0O0i1 {
                public static final InputConfiguration I00000oIO(String str, ArrayList arrayList) {
/* 5 */             if (arrayList.isEmpty()) {
/* 88 */                I000II.I001IO000("Call to create InputConfiguration but list of InputConfigData is empty.");
/* 91 */                return null;
                    }
/* 12 */            if (arrayList.size() == 1) {
/* 18 */                IoloIII01 ioloIII01 = (IoloIII01) IOOi0Ool1i.I001lllioOl(arrayList);
/* 28 */                return new InputConfiguration(ioloIII01.I00000oIO, ioloIII01.I00000oOI, ioloIII01.I0000Il00O);
                    }
/* 40 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 43 */            Iterator it = arrayList.iterator();
/* 51 */            while (it.hasNext()) {
/* 57 */                IoloIII01 ioloIII012 = (IoloIII01) it.next();
/* 68 */                arrayList2.add(new MultiResolutionStreamInfo(ioloIII012.I00000oIO, ioloIII012.I00000oOI, str));
                    }
/* 82 */            return new InputConfiguration(arrayList2, ((IoloIII01) IOOi0Ool1i.I001lllioOl(arrayList)).I0000Il00O);
                }
            }
