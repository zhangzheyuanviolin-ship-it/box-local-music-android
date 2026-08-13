            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.List;
            
/* 9 */     public final class OI1oil implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;

                public OI1oil(OI10i0Il oI10i0Il) {
/* 3 */             this.I00iOIl = 11;
/* 8 */             this.I00iiI = oI10i0Il;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             OI10i0Il oI10i0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 310 */                   List list = (List) oI10i0Il.getValue();
/* 316 */                   ArrayList arrayList = new ArrayList();
/* 327 */                   for (Object obj : list) {
/* 346 */                       if (O0000Ioio00.I0000O(((OI1OloOIO1O) obj).I00iiI.I00iOIl, "composable")) {
/* 348 */                           arrayList.add(obj);
                                }
                            }
                            break;
                        case 1:
/* 291 */                   O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) oI10i0Il.getValue();
/* 293 */                   if (o0iOOo0Ii != null) {
                                break;
                            } else {
/* 299 */                       Ioll0IliO1l.I0000O("Required value was null.");
/* 302 */                       IOOlIIilOl0.I0000Il00O();
                                break;
                            }
                        case 2:
/* 283 */                   oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case 3:
/* 277 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 4:
/* 271 */                   oI10i0Il.setValue(null);
                            break;
                        case 5:
/* 267 */                   oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case 6:
/* 261 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 7:
/* 255 */                   oI10i0Il.setValue(null);
                            break;
                        case 8:
/* 251 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case 9:
/* 231 */                   oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case 10:
/* 225 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 11:
/* 219 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 12:
/* 213 */                   oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case 13:
/* 207 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 14:
/* 201 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 15:
/* 195 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 16:
/* 189 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case 17:
/* 183 */                   oI10i0Il.setValue(Boolean.TRUE);
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 177 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 171 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 165 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 159 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 153 */                   oI10i0Il.setValue(Boolean.FALSE);
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 147 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 127 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 107 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 87 */                    oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case 27:
/* 67 */                    oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 47 */                    oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                        default:
/* 27 */                    oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
                            break;
                    }
/* 30 */            return ooiIlOl1iI;
                }

/* 10 */        public OI1oil(int i) {
/* 11 */            this.I00iOIl = i;
                }
            }
