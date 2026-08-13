            package p000;
            
            public abstract class lO1OlOlOlli {
                /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Oil000 I00000oIO(O0iiOioolIi o0iiOioolIi, boolean z) {
/* 5 */             O1ooOo o1ooOo = (O1ooOo) o0iiOioolIi.I010101Oo1lO.I00io1l;
/* 11 */            IiIill0O0li1 iiIill0O0li1 = null;
/* 12 */            if ((o1ooOo.I00iio & 8) != 0) {
                        loop0: while (true) {
/* 14 */                    if (o1ooOo == null) {
                                break;
                            }
/* 20 */                    if ((o1ooOo.I00iiO & 8) != 0) {
/* 22 */                        O1ooOo o1ooOoI0000Il00O = o1ooOo;
/* 23 */                        OI110O0 oi110o0 = null;
/* 24 */                        while (o1ooOoI0000Il00O != null) {
/* 28 */                            if (o1ooOoI0000Il00O instanceof OiiooOl) {
/* 30 */                                iiIill0O0li1 = o1ooOoI0000Il00O;
                                        break loop0;
                                    }
/* 36 */                            if ((o1ooOoI0000Il00O.I00iiO & 8) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 47 */                                int i = 0;
/* 49 */                                for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 55 */                                    if ((o1ooOo2.I00iiO & 8) != 0) {
/* 57 */                                        i++;
/* 59 */                                        if (i == 1) {
/* 61 */                                            o1ooOoI0000Il00O = o1ooOo2;
                                                } else {
/* 63 */                                            if (oi110o0 == null) {
/* 71 */                                                oi110o0 = new OI110O0(new O1ooOo[16]);
                                                    }
/* 74 */                                            if (o1ooOoI0000Il00O != null) {
/* 76 */                                                oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 79 */                                                o1ooOoI0000Il00O = null;
                                                    }
/* 80 */                                            oi110o0.I00000oOI(o1ooOo2);
                                                }
                                            }
                                        }
/* 86 */                                if (i == 1) {
                                        }
                                    }
/* 89 */                            o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                }
/* 98 */                        if ((o1ooOo.I00iio & 8) != 0) {
                                    break;
                                }
/* 100 */                       o1ooOo = o1ooOo.I00ilO0;
                            } else if ((o1ooOo.I00iio & 8) != 0) {
                            }
                        }
                    }
/* 107 */           O1ooOo o1ooOo3 = ((O1ooOo) ((OiiooOl) iiIill0O0li1)).I00iOIl;
/* 109 */           OiioiIIlooo oiioiIIloooI001i1lo1io = o0iiOioolIi.I001i1lo1io();
/* 113 */           if (oiioiIIloooI001i1lo1io == null) {
/* 117 */               oiioiIIloooI001i1lo1io = new OiioiIIlooo();
                    }
/* 122 */           return new Oil000(o1ooOo3, z, o0iiOioolIi, oiioiIIloooI001i1lo1io);
                }
            }
