            package p000;

            import android.graphics.RectF;
            import android.os.Looper;
            import android.view.View;
            import androidx.work.impl.model.WorkProgress;
            import androidx.work.impl.model.WorkTag;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class i01O0010i implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public i01O0010i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             char c = 1;
                    switch (i) {
                        case 0:
/* 350 */                   ((i01O0o) this.I00iiI).I00000oOI.I0000O((Olil0III) obj, (WorkProgress) this.I00iiO);
/* 353 */                   return ooiIlOl1iI;
                        case 1:
/* 300 */                   Ii11I1OOII1 ii11I1OOII1 = (Ii11I1OOII1) this.I00iiI;
/* 304 */                   String str = (String) this.I00iiO;
/* 310 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("UPDATE workspec SET output=? WHERE id=?");
                            try {
/* 314 */                       Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 320 */                       oiIIl0O1l0lI00000oIO.I000iOII(1, il01ool0o.I0000Il00O(ii11I1OOII1));
/* 323 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(2, str);
/* 326 */                       oiIIl0O1l0lI00000oIO.I00ol1();
/* 332 */                       return ooiIlOl1iI;
                            } finally {
                            }
                        case 2:
/* 253 */                   i01IOiO1lO i01ioio1lo = (i01IOiO1lO) this.I00iiI;
/* 257 */                   String str2 = (String) this.I00iiO;
/* 259 */                   Olil0III olil0III = (Olil0III) obj;
/* 263 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO2 = olil0III.I00000oIO("UPDATE workspec SET state=? WHERE id=?");
                            try {
/* 272 */                       oiIIl0O1l0lI00000oIO2.I000OiO(1, liIOOIo0.I000iOII(i01ioio1lo));
/* 275 */                       oiIIl0O1l0lI00000oIO2.I00Io1o110i(2, str2);
/* 278 */                       oiIIl0O1l0lI00000oIO2.I00ol1();
/* 281 */                       int iI00000oIO = lO01iO1I1lOi.I00000oIO(olil0III);
/* 285 */                       oiIIl0O1l0lI00000oIO2.close();
/* 288 */                       return Integer.valueOf(iI00000oIO);
                            } finally {
                            }
                        case 3:
/* 247 */                   ((i01OoioI001o) this.I00iiI).I00000oOI.I0000O((Olil0III) obj, (WorkTag) this.I00iiO);
/* 250 */                   return ooiIlOl1iI;
                        case 4:
/* 124 */                   i01l0IiO i01l0iio = (i01l0IiO) this.I00iiI;
/* 128 */                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiO;
/* 130 */                   IOl10lI1 iOl10lI1 = (IOl10lI1) obj;
/* 134 */                   if (!i01l0iio.I00iiO) {
/* 136 */                       iOl10lI1.I0000oI00();
/* 139 */                       View view = iOl10lI1.I00000oIO;
/* 143 */                       I01O1lIi i01O1lIiI000iOII = iOl10lI1.I0000O.I000iOII();
/* 147 */                       i01l0iio.I00ilI0I1 = illiIl1l11O;
/* 151 */                       if (i01l0iio.I00iio == null) {
/* 169 */                           if (O0000Ioio00.I0000O(Looper.myLooper(), view.getHandler().getLooper())) {
/* 189 */                               i01l0iio.I00iio = i01O1lIiI000iOII;
/* 191 */                               i01O1lIiI000iOII.I00li1OI(i01l0iio);
                                    } else {
/* 175 */                               Io11iII11ll io11iII11ll = new Io11iII11ll(27);
/* 178 */                               io11iII11ll.I00iiI = i01l0iio;
/* 180 */                               io11iII11ll.I00iiO = i01O1lIiI000iOII;
/* 182 */                               VarHandle.storeStoreFence();
/* 185 */                               view.post(io11iII11ll);
                                    }
                                } else if (i01O1lIiI000iOII.I00ol1().I00000oIO(O0oOi0I.I00iiO)) {
/* 207 */                           IOlIOiI0iiI1 iOlIOiI0iiI1 = i01l0iio.I00iiI;
/* 211 */                           OoIIO0O1lII ooIIO0O1lII = new OoIIO0O1lII(c == true ? 1 : 0);
/* 214 */                           ooIIO0O1lII.I00iiI = i01l0iio;
/* 216 */                           ooIIO0O1lII.I00iiO = iOl10lI1;
/* 218 */                           ooIIO0O1lII.I00iio = illiIl1l11O;
/* 220 */                           VarHandle.storeStoreFence();
/* 231 */                           iOlIOiI0iiI1.I001lloI(new IOii1l(-1723985096, ooIIO0O1lII, true));
                                }
                            }
/* 234 */                   return ooiIlOl1iI;
                        default:
/* 12 */                    IIOo1i iIOo1i = (IIOo1i) this.I00iiI;
/* 16 */                    IiOoOOO iiOoOOO = (IiOoOOO) this.I00iiO;
/* 18 */                    IiOoOOO iiOoOOO2 = (IiOoOOO) obj;
/* 20 */                    RectF rectF = iiOoOOO.I0000Il00O;
/* 22 */                    RectF rectF2 = iiOoOOO2.I0000Il00O;
/* 24 */                    iIOo1i.getClass();
/* 70 */                    float fMax = Math.max(0.0f, Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top)) * Math.max(0.0f, Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left));
/* 90 */                    float fHeight = ((rectF2.height() * rectF2.width()) + (rectF.height() * rectF.width())) - fMax;
/* 117 */                   return Boolean.valueOf((fHeight > 0.0f ? fMax / fHeight : 0.0f) > 0.45f && O0000Ioio00.I0000O(iiOoOOO2.I00000oIO, iiOoOOO.I00000oIO));
                    }
                }
            }
