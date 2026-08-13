            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class l1IOiIo1IO1 {
                public static final ArrayList I00000oIO(IoooOl1001li ioooOl1001li) {
/* 3 */             O0iiOioolIi o0iiOioolIiI00olI = ((O1IiO0l) ioooOl1001li).I00olI();
/* 7 */             boolean zI00000oOI = I00000oOI(o0iiOioolIiI00olI);
/* 11 */            List listI000oI1ioi = o0iiOioolIiI00olI.I000oI1ioi();
/* 18 */            OI0oIOI oI0oIOI = (OI0oIOI) listI000oI1ioi;
/* 26 */            ArrayList arrayList = new ArrayList(((OI110O0) oI0oIOI.I00iiI).I00iiO);
/* 29 */            int size = listI000oI1ioi.size();
/* 34 */            for (int i = 0; i < size; i++) {
/* 40 */                O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) oI0oIOI.get(i);
/* 53 */                arrayList.add(zI00000oOI ? o0iiOioolIi.I000l1() : o0iiOioolIi.I000lI());
                    }
/* 77 */            return arrayList;
                }

                public static final boolean I00000oOI(O0iiOioolIi o0iiOioolIi) {
/* 5 */             int iOrdinal = o0iiOioolIi.I010I0.I0000O.ordinal();
/* 10 */            if (iOrdinal != 0) {
/* 13 */                if (iOrdinal != 1) {
/* 16 */                    if (iOrdinal != 2) {
/* 19 */                        if (iOrdinal != 3) {
/* 22 */                            if (iOrdinal != 4) {
/* 41 */                                I000II.I00000oIO();
/* 9 */                                 return false;
                                    }
/* 24 */                            O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
/* 28 */                            if (o0iiOioolIiI001IO000 != null) {
/* 30 */                                return I00000oOI(o0iiOioolIiI001IO000);
                                    }
/* 37 */                            I000II.I000iOII("no parent for idle node");
/* 9 */                             return false;
                                }
                            }
                        }
/* 12 */                return true;
                    }
/* 9 */             return false;
                }
            }
