            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class looo1olo1 extends o001IlOi0O implements o0IIiol0oIo {
                protected looOi1oiO zzb;

                public final Object I000oI1ioi(o000O0II11oi o000o0ii11oi) {
/* 1 */             o0oI0I o0oi0i = o000o0ii11oi.I00000oIO;
/* 3 */             looolOIIo loooloiio = o000o0ii11oi.I0000O;
/* 13 */            if (o0oi0i != ((o001IlOi0O) I000iOII(6, null))) {
/* 79 */                I000II.I000iOII("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
/* 6 */                 return null;
                    }
/* 19 */            Object obj = this.zzb.I00000oIO.get(loooloiio);
/* 23 */            if (obj == null) {
/* 25 */                return o000o0ii11oi.I00000oOI;
                    }
/* 34 */            if (loooloiio.I00iOIl.I00iOIl != o0iolO0OI.I00ioIO) {
/* 76 */                return obj;
                    }
/* 38 */            ArrayList arrayList = new ArrayList();
/* 51 */            for (Object obj2 : (List) obj) {
/* 63 */                if (loooloiio.I00iOIl.I00iOIl == o0iolO0OI.I00ioIO) {
/* 71 */                    ((Integer) obj2).getClass();
/* 74 */                    throw null;
                        }
/* 65 */                arrayList.add(obj2);
                    }
/* 75 */            return arrayList;
                }
            }
