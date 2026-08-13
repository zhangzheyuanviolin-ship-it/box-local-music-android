            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import com.google.ai.edge.gallery.data.AllowedSkill;
            import com.google.mlkit.genai.imagedescription.ImageDescriber;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.ExecutorService;
            import kotlin.jvm.functions.Function1;
            
            public final class I0IliI0i implements IllOOo00lI {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;

                public I0IliI0i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 349 */                   O1i1O1I o1i1O1I = (O1i1O1I) this.I00ilO0;
/* 351 */                   OI10i0Il oI10i0Il = this.I00iiI;
/* 355 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iiO;
/* 359 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00iio;
/* 363 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00ilI0I1;
/* 367 */                   OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00io1l;
/* 371 */                   OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00ioIO;
/* 375 */                   oI10i0Il.setValue(Boolean.FALSE);
/* 392 */                   String string = OlOoOIi0o.I00OIo(((Oo0OI01Il) oI10i0Il2.getValue()).I00000oIO.I00iiI).toString();
/* 400 */                   if (string.length() > 0) {
/* 404 */                       oI10i0Il3.setValue(Boolean.TRUE);
/* 433 */                       o1i1O1I.I0000oI00(string, (O1i0O00) oI10i0Il4.getValue(), ((Oo0OI01Il) oI10i0Il5.getValue()).I00000oIO.I00iiI, ((Oo0OI01Il) oI10i0Il6.getValue()).I00000oIO.I00iiI);
                                break;
                            }
                            break;
                        case 1:
/* 254 */                   OI10i0Il oI10i0Il7 = this.I00iiI;
/* 258 */                   Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00ilO0;
/* 262 */                   OI10i0Il oI10i0Il8 = (OI10i0Il) this.I00iiO;
/* 266 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00io1l;
/* 270 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00ioIO;
/* 274 */                   OI10i0Il oI10i0Il9 = (OI10i0Il) this.I00iio;
/* 278 */                   OI10i0Il oI10i0Il10 = (OI10i0Il) this.I00ilI0I1;
/* 284 */                   AllowedSkill allowedSkill = (AllowedSkill) oI10i0Il7.getValue();
/* 286 */                   if (allowedSkill != null) {
/* 288 */                       String skillUrl = allowedSkill.getSkillUrl();
/* 302 */                       oI10i0Il8.setValue(Oio0lI.I0001Ioi1lo((Set) oI10i0Il8.getValue(), skillUrl));
/* 307 */                       I0O10II11ioi i0O10II11ioi = new I0O10II11ioi(1);
/* 310 */                       i0O10II11ioi.I00iiI = skillUrl;
/* 312 */                       i0O10II11ioi.I00iiO = illOOo00lI;
/* 314 */                       i0O10II11ioi.I00iio = illOOo00lI2;
/* 316 */                       i0O10II11ioi.I00ilI0I1 = oI10i0Il8;
/* 318 */                       VarHandle.storeStoreFence();
/* 323 */                       I0O10ll i0O10ll = new I0O10ll(1);
/* 326 */                       i0O10ll.I00iiI = skillUrl;
/* 328 */                       i0O10ll.I00iiO = oI10i0Il8;
/* 330 */                       i0O10ll.I00iio = oI10i0Il9;
/* 332 */                       VarHandle.storeStoreFence();
/* 335 */                       ol0o1OiOIIIl.I0010o(i0O10II11ioi, skillUrl, i0O10ll);
                            }
/* 340 */                   oI10i0Il10.setValue(Boolean.FALSE);
/* 343 */                   oI10i0Il7.setValue(null);
                            break;
                        case 2:
/* 250 */                   iOi1II01i0.I0000O((Ii0110) this.I00ilO0, null, null, new I1iIiIIIio0((I1o1Ii0I) this.I00io1l, (Bitmap) this.I00ioIO, this.I00iiI, (OI10i0Il) this.I00iiO, (OI10i0Il) this.I00iio, (OI10i0Il) this.I00ilI0I1, (IOoil1iiIilo) null), 3);
                            break;
                        case 3:
/* 154 */                   OI10i0Il oI10i0Il11 = this.I00iiI;
/* 159 */                   Ii0110 ii0110 = (Ii0110) this.I00ilO0;
/* 164 */                   OI10i0Il oI10i0Il12 = (OI10i0Il) this.I00iiO;
/* 169 */                   OI10i0Il oI10i0Il13 = (OI10i0Il) this.I00iio;
/* 174 */                   ImageDescriber imageDescriber = (ImageDescriber) this.I00io1l;
/* 179 */                   OI10i0Il oI10i0Il14 = (OI10i0Il) this.I00ilI0I1;
/* 184 */                   Ol1OlloIO ol1OlloIO = (Ol1OlloIO) this.I00ioIO;
/* 191 */                   Bitmap bitmap = (Bitmap) oI10i0Il11.getValue();
/* 193 */                   if (bitmap != null) {
/* 197 */                       oI10i0Il12.setValue(Boolean.TRUE);
/* 200 */                       oI10i0Il13.setValue("");
/* 209 */                       iOi1II01i0.I0000O(ii0110, null, null, new Ilol0Oo(imageDescriber, bitmap, ii0110, oI10i0Il14, oI10i0Il13, ol1OlloIO, oI10i0Il12, null), 3);
                                break;
                            }
                            break;
                        case 4:
/* 108 */                   Ioi1Io1o ioi1Io1o = (Ioi1Io1o) this.I00ilO0;
/* 112 */                   ExecutorService executorService = (ExecutorService) this.I00iiO;
/* 116 */                   OilIoI11 oilIoI11 = (OilIoI11) this.I00iio;
/* 120 */                   Function1 function1 = (Function1) this.I00ilI0I1;
/* 124 */                   Ii0110 ii01102 = (Ii0110) this.I00io1l;
/* 128 */                   Ol010000lo00 ol010000lo00 = (Ol010000lo00) this.I00ioIO;
/* 130 */                   OI10i0Il oI10i0Il15 = this.I00iiI;
/* 134 */                   O1lIO1O o1lIO1O = new O1lIO1O();
/* 137 */                   o1lIO1O.I00000oIO = oilIoI11;
/* 139 */                   o1lIO1O.I00000oOI = function1;
/* 141 */                   o1lIO1O.I0000Il00O = ii01102;
/* 143 */                   o1lIO1O.I0000O = ol010000lo00;
/* 145 */                   o1lIO1O.I0000oI00 = oI10i0Il15;
/* 147 */                   VarHandle.storeStoreFence();
/* 150 */                   ioi1Io1o.I00IlilI0i0i(executorService, o1lIO1O);
                            break;
                        default:
/* 15 */                    O1o10Iiio o1o10Iiio = (O1o10Iiio) this.I00ilO0;
/* 20 */                    Context context = (Context) this.I00iio;
/* 25 */                    O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00ilI0I1;
/* 30 */                    List list = (List) this.I00io1l;
/* 35 */                    O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00ioIO;
/* 37 */                    OI10i0Il oI10i0Il16 = this.I00iiI;
/* 41 */                    OI10i0Il oI10i0Il17 = (OI10i0Il) this.I00iiO;
/* 45 */                    oI10i0Il16.setValue(Boolean.FALSE);
/* 48 */                    oI10i0Il17.setValue("");
/* 55 */                    I0IoiIiOoi i0IoiIiOoi = new I0IoiIiOoi(9);
/* 58 */                    i0IoiIiOoi.I00iiI = oI10i0Il17;
/* 60 */                    i0IoiIiOoi.I00iiO = oI10i0Il16;
/* 62 */                    VarHandle.storeStoreFence();
/* 68 */                    O1o10Iiio.I0001Ioi1lo(o1o10Iiio.I00000oOI, false);
/* 71 */                    o1o10Iiio.I000OiO(true);
/* 76 */                    o1o10Iiio.I000iOII("'");
/* 79 */                    o1o10Iiio.I000II();
/* 82 */                    o1o10Iiio.I000O01llI0(false);
/* 85 */                    o1o10Iiio.I0000oI00();
/* 102 */                   iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o1o10Iiio), IiiIil1lOIO.I00000oIO, null, new I0O0Ooi10l(o1ol100o0O, o1oIOiI11o0, context, list, i0IoiIiOoi, null, 5), 2);
                            break;
                    }
/* 105 */           return ooiIlOl1iI;
                }
            }
