            package p000;

            import java.util.function.Function;
            
            public abstract class lI10i0I0l1 {
                public static final l1IllOOOo1 I00000oIO = new l1IllOOOo1("engine", i0OIIoiOl1I.I00100l0, lI0lO0ili.I00000oOI);
                public static final l1IllOOOo1 I00000oOI = new l1IllOOOo1("model", i0OIIoiOl1I.I000OOo1O, i0OIIoiOl1I.I000l1);
                public static final l1IllOOOo1 I0000Il00O = new l1IllOOOo1("lora", i0OIIoiOl1I.I000lI, i0OIIoiOl1I.I000o00OoI0I);
                public static final l1IllOOOo1 I0000O = new l1IllOOOo1("drafter", i0OIIoiOl1I.I000oI1ioi, i0OIIoiOl1I.I0000O);
                public static final l1IllOOOo1 I0000oI00 = new l1IllOOOo1("image_encoder", i0OIIoiOl1I.I0000oI00, i0OIIoiOl1I.I0001Ioi1lo);
                public static final l1IllOOOo1 I0001Ioi1lo = new l1IllOOOo1("audio_encoder", i0OIIoiOl1I.I000II, i0OIIoiOl1I.I000O01llI0);
                public static final l1IllOOOo1 I000II = new l1IllOOOo1("kv_cache", i0OIIoiOl1I.I000OiO, i0OIIoiOl1I.I000iOII);

                public static String I00000oIO(il1II00lIiI il1ii00liii) {
                    int i;
                    l1IllOOOo1 l1illoooo1;
/* 1 */             if (il1ii00liii == null) {
/* 3 */                 return "{}";
                    }
/* 11 */            iOlOOOll1OiI ioloooll1oii = (iOlOOOll1OiI) il1ii00liii.I000O01llI0(5);
/* 13 */            iOlOoOlI0li1 ioloooli0li1 = ioloooll1oii.I00iOIl;
/* 24 */            if (!ioloooli0li1.getClass().isInstance(il1ii00liii)) {
/* 242 */               I000II.I000iOII("mergeFrom(MessageLite) can only merge messages of the same type.");
/* 23 */                return null;
                    }
/* 31 */            if (!ioloooli0li1.equals(il1ii00liii)) {
/* 39 */                if (!ioloooll1oii.I00iiI.I00000oIO()) {
/* 47 */                    iOlOoOlI0li1 ioloooli0li12 = (iOlOoOlI0li1) ioloooll1oii.I00iOIl.I000O01llI0(4);
/* 61 */                    iOloOOOIOII.I00000oOI.I00000oIO(ioloooli0li12.getClass()).zzd(ioloooli0li12, ioloooll1oii.I00iiI);
/* 64 */                    ioloooll1oii.I00iiI = ioloooli0li12;
                        }
/* 66 */                iOlOoOlI0li1 ioloooli0li13 = ioloooll1oii.I00iiI;
/* 78 */                iOloOOOIOII.I00000oOI.I00000oIO(ioloooli0li13.getClass()).zzd(ioloooli0li13, il1ii00liii);
                    }
/* 81 */            iil0I0 iil0i0 = (iil0I0) ioloooll1oii;
/* 85 */            StringBuilder sb = new StringBuilder();
/* 90 */            sb.append("{");
/* 94 */            int i2 = 1;
                    while (true) {
                        switch (i2) {
                            case 0:
/* 115 */                       i = 1;
                                break;
                            case 1:
/* 113 */                       i = 2;
                                break;
                            case 2:
/* 111 */                       i = 3;
                                break;
                            case 3:
/* 109 */                       i = 4;
                                break;
                            case 4:
/* 107 */                       i = 5;
                                break;
                            case 5:
/* 105 */                       i = 6;
                                break;
                            case 6:
/* 103 */                       i = 7;
                                break;
                            case 7:
/* 100 */                       i = 8;
                                break;
                            default:
/* 98 */                        i = 0;
                                break;
                        }
/* 116 */               if (i == 0) {
/* 219 */                   if (sb.length() > 1) {
/* 227 */                       sb.setLength(sb.length() - 2);
                            }
/* 232 */                   sb.append("}");
/* 235 */                   return sb.toString();
                        }
                        switch (i - 1) {
                            case 1:
/* 143 */                       l1illoooo1 = I00000oIO;
                                break;
                            case 2:
/* 140 */                       l1illoooo1 = I00000oOI;
                                break;
                            case 3:
/* 137 */                       l1illoooo1 = I0000oI00;
                                break;
                            case 4:
/* 134 */                       l1illoooo1 = I0001Ioi1lo;
                                break;
                            case 5:
/* 131 */                       l1illoooo1 = I0000O;
                                break;
                            case 6:
/* 128 */                       l1illoooo1 = I0000Il00O;
                                break;
                            case 7:
/* 125 */                       l1illoooo1 = I000II;
                                break;
                            default:
/* 123 */                       l1illoooo1 = null;
                                break;
                        }
/* 145 */               if (l1illoooo1 != null) {
/* 158 */                   long jLongValue = ((Long) ((Function) l1illoooo1.I00iiO).apply(iil0i0)).longValue();
/* 172 */                   int iIntValue = ((Integer) ((Function) l1illoooo1.I00iio).apply(iil0i0)).intValue();
/* 180 */                   if (jLongValue > 0 || iIntValue > 0) {
/* 188 */                       sb.append((String) l1illoooo1.I00iiI);
/* 193 */                       sb.append(": (");
/* 196 */                       sb.append(jLongValue);
/* 201 */                       sb.append(" ms, count: ");
/* 204 */                       sb.append(iIntValue);
/* 209 */                       sb.append("), ");
                            }
                        }
/* 212 */               i2++;
                    }
                }
            }
