            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
/* 7 */     public final class OioIO1o1 implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;

                public OioIO1o1(OI10i0Il oI10i0Il, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oI10i0Il;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00iiI;
                    switch (i) {
                        case 0:
/* 272 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 275 */                   return ooiIlOl1iI;
                        case 1:
/* 266 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
/* 269 */                   return ooiIlOl1iI;
                        case 2:
/* 246 */                   oI10i0Il.setValue(Boolean.valueOf(!((Boolean) oI10i0Il.getValue()).booleanValue()));
/* 249 */                   return ooiIlOl1iI;
                        case 3:
/* 226 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 229 */                   return ooiIlOl1iI;
                        case 4:
/* 220 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 223 */                   return ooiIlOl1iI;
                        case 5:
/* 214 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 217 */                   return ooiIlOl1iI;
                        case 6:
/* 208 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 211 */                   return ooiIlOl1iI;
                        case 7:
/* 202 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 205 */                   return ooiIlOl1iI;
                        case 8:
/* 196 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 199 */                   return ooiIlOl1iI;
                        case 9:
/* 190 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 193 */                   return ooiIlOl1iI;
                        case 10:
/* 184 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 187 */                   return ooiIlOl1iI;
                        case 11:
/* 178 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 181 */                   return ooiIlOl1iI;
                        case 12:
/* 172 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 175 */                   return ooiIlOl1iI;
                        case 13:
/* 166 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 169 */                   return ooiIlOl1iI;
                        case 14:
/* 160 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 163 */                   return ooiIlOl1iI;
                        case 15:
/* 154 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 157 */                   return ooiIlOl1iI;
                        case 16:
/* 148 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 151 */                   return ooiIlOl1iI;
                        case 17:
/* 142 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 145 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 136 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 139 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_INDEX:
/* 130 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 133 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_INDEX:
/* 124 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 127 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_THUMB:
/* 118 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 121 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_THUMB:
/* 112 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 115 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_HIP:
/* 106 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 109 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_HIP:
/* 100 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 103 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 94 */                    oI10i0Il.setValue(Boolean.FALSE);
/* 97 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_KNEE:
/* 34 */                    List list = ((Ol0loOOoo) oI10i0Il.getValue()).I00000oOI;
/* 40 */                    int i2 = 0;
/* 41 */                    if (!(list instanceof Collection) || !list.isEmpty()) {
/* 53 */                        Iterator it = list.iterator();
/* 61 */                        while (it.hasNext()) {
/* 75 */                            if (((Ol0oI1llIloI) it.next()).I00000oIO.I001l0I00() && (i2 = i2 + 1) < 0) {
/* 82 */                                IOOi1I.I000l1();
/* 86 */                                throw null;
                                    }
                                }
                            }
/* 87 */                    return Integer.valueOf(i2);
                        case 27:
/* 24 */                    oI10i0Il.setValue(Boolean.FALSE);
/* 27 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_ANKLE:
/* 18 */                    oI10i0Il.setValue(Boolean.FALSE);
/* 21 */                    return ooiIlOl1iI;
                        default:
/* 12 */                    oI10i0Il.setValue(Boolean.FALSE);
/* 15 */                    return ooiIlOl1iI;
                    }
                }
            }
