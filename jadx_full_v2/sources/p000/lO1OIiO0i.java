            package p000;

            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lO1OIiO0i {
                /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00d6 A[LOOP:2: B:31:0x007f->B:42:0x00d6, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[EDGE_INSN: B:50:0x00dd->B:43:0x00dd BREAK  A[LOOP:2: B:31:0x007f->B:42:0x00d6], SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OI0lli1 I00000oIO(OiiOlI0I oiiOlI0I, List list, Function1 function1, IlliIl1l11O illiIl1l11O, IlliOIilI illiOIilI) {
                    long j;
                    OiiOlI0I oiiOlI0I2;
/* 3 */             Function1 function12 = function1;
/* 9 */             long j2 = oiiOlI0I.I00000oIO.I0000Il00O;
/* 11 */            OiiOOli oiiOOli = oiiOlI0I.I00000oOI;
/* 13 */            long j3 = oiiOOli.I0000Il00O;
/* 17 */            if (j2 == j3) {
/* 19 */                OI0lli1 oI0lli1 = O1IO1IIIO0OO.I00000oIO;
/* 23 */                OI0lli1 oI0lli12 = new OI0lli1();
/* 26 */                oI0lli12.I000OOo1O(j2, oiiOlI0I);
/* 29 */                return oI0lli12;
                    }
/* 30 */            Iterator it = list.iterator();
/* 35 */            int i = 0;
                    while (true) {
/* 41 */                if (!it.hasNext()) {
/* 65 */                    i = -1;
                            break;
                        }
/* 59 */                if (((Number) function12.invoke(it.next())).longValue() == j2) {
                            break;
                        }
/* 62 */                i++;
                    }
/* 66 */            Iterator it2 = list.iterator();
/* 70 */            int i2 = 0;
                    while (true) {
/* 75 */                if (!it2.hasNext()) {
/* 99 */                    i2 = -1;
                            break;
                        }
/* 93 */                if (((Number) function12.invoke(it2.next())).longValue() == j3) {
                            break;
                        }
/* 96 */                i2++;
                    }
/* 100 */           if (i == -1 || i2 == -1) {
/* 223 */               return O1IO1IIIO0OO.I00000oIO;
                    }
/* 106 */           int iMin = Math.min(i, i2);
/* 110 */           int iMax = Math.max(i, i2);
/* 114 */           boolean z = i > i2;
/* 117 */           OI0lli1 oI0lli13 = O1IO1IIIO0OO.I00000oIO;
/* 121 */           OI0lli1 oI0lli14 = new OI0lli1();
/* 124 */           if (iMin <= iMax) {
                        while (true) {
/* 128 */                   Object obj = list.get(iMin);
/* 138 */                   long jLongValue = ((Number) function12.invoke(obj)).longValue();
/* 144 */                   if (jLongValue != j2) {
/* 171 */                       j = j2;
/* 175 */                       if (jLongValue != j3) {
/* 206 */                           oiiOlI0I2 = (OiiOlI0I) illiIl1l11O.invoke(obj, Boolean.valueOf(z));
/* 208 */                           if (oiiOlI0I2 != null) {
/* 210 */                               oI0lli14.I000OOo1O(jLongValue, oiiOlI0I2);
                                    }
/* 213 */                           if (iMin != iMax) {
                                        break;
                                    }
/* 215 */                           iMin++;
/* 217 */                           function12 = function1;
/* 219 */                           j2 = j;
                                } else {
/* 193 */                           oiiOlI0I2 = (OiiOlI0I) illiOIilI.I000l1(obj, Boolean.FALSE, Integer.valueOf(oiiOOli.I00000oOI), Boolean.valueOf(z));
                                }
                            } else {
/* 148 */                       j = j2;
/* 166 */                       oiiOlI0I2 = (OiiOlI0I) illiOIilI.I000l1(obj, Boolean.TRUE, Integer.valueOf(oiiOlI0I.I00000oIO.I00000oOI), Boolean.valueOf(z));
                            }
/* 208 */                   if (oiiOlI0I2 != null) {
                            }
/* 213 */                   if (iMin != iMax) {
                            }
                        }
                    }
/* 222 */           return oI0lli14;
                }

                public static final Iii1I01II I00000oOI(Iii1I01II iii1I01II, Iii1I01II iii1I01II2) {
/* 1 */             int iOrdinal = iii1I01II2.ordinal();
/* 5 */             if (iOrdinal == 0) {
/* 44 */                return Iii1I01II.I00iOIl;
                    }
/* 10 */            if (iOrdinal != 1) {
/* 12 */                if (iOrdinal == 2) {
/* 14 */                    return Iii1I01II.I00iiO;
                        }
/* 17 */                I000II.I00000oIO();
/* 7 */                 return null;
                    }
/* 21 */            int iOrdinal2 = iii1I01II.ordinal();
/* 25 */            if (iOrdinal2 == 0) {
/* 41 */                return Iii1I01II.I00iOIl;
                    }
/* 27 */            if (iOrdinal2 == 1) {
/* 38 */                return Iii1I01II.I00iiI;
                    }
/* 29 */            if (iOrdinal2 == 2) {
/* 31 */                return Iii1I01II.I00iiO;
                    }
/* 34 */            I000II.I00000oIO();
/* 7 */             return null;
                }
            }
