            package p000;

            import android.util.Log;
            import java.io.File;
            
/* 13 */    public final class Ol0o0I01iIO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public final Ol0o1OiOIIIl I00iiI;
                public final Ol0ioI1iI I00iiO;
                public final String I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol0o0I01iIO(Ol0ioI1iI ol0ioI1iI, Ol0o1OiOIIIl ol0o1OiOIIIl, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iiO = ol0ioI1iI;
/* 6 */             this.I00iiI = ol0o1OiOIIIl;
/* 8 */             this.I00iio = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iio;
/* 5 */             Ol0ioI1iI ol0ioI1iI = this.I00iiO;
/* 7 */             Ol0o1OiOIIIl ol0o1OiOIIIl = this.I00iiI;
                    switch (i) {
                        case 0:
/* 20 */                    return new Ol0o0I01iIO(ol0ioI1iI, ol0o1OiOIIIl, str, iOoil1iiIilo);
                        default:
/* 14 */                    return new Ol0o0I01iIO(ol0o1OiOIIIl, ol0ioI1iI, str, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 28 */                    ((Ol0o0I01iIO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((Ol0o0I01iIO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             String str = this.I00iio;
/* 7 */             Ol0ioI1iI ol0ioI1iI = this.I00iiO;
/* 9 */             Ol0o1OiOIIIl ol0o1OiOIIIl = this.I00iiI;
                    switch (i) {
                        case 0:
/* 113 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 115 */                   lIoii1l01l0i.I00000oOI(obj);
/* 126 */                   if (ol0ioI1iI.I001IIilI0O().length() > 0) {
                                try {
/* 142 */                           IlIl10.I0000O(IlIl10.I000iOII(ol0o1OiOIIIl.I0000Il00O.getFilesDir(), ol0ioI1iI.I001IIilI0O()));
                                } catch (Exception e) {
/* 165 */                           Log.w("AGSkillManagerVM", "Failed to delete skill directory: " + ol0ioI1iI.I001IIilI0O(), e);
                                }
                            }
/* 168 */                   Ii1liIllli0 ii1liIllli0 = ol0o1OiOIIIl.I00000oOI;
/* 170 */                   ii1liIllli0.getClass();
/* 180 */                   iOi1IOoIO0l.I00000oOI(new Ii1lI0OO(ii1liIllli0, str, null, 0));
                            break;
                        default:
/* 18 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 20 */                    lIoii1l01l0i.I00000oOI(obj);
/* 46 */                    File file = new File(new File(IlIl10.I000iOII(ol0o1OiOIIIl.I0000Il00O.getFilesDir(), ol0ioI1iI.I001IIilI0O()), "scripts"), str);
/* 53 */                    if (!file.exists()) {
/* 109 */                       file.getPath();
                                break;
                            } else {
                                try {
/* 59 */                            if (file.delete()) {
/* 61 */                                file.getPath();
                                    } else {
/* 83 */                                Log.w("AGSkillManagerVM", "Failed to delete script: " + file.getPath());
                                    }
                                    break;
                                } catch (Exception e2) {
/* 105 */                           Log.e("AGSkillManagerVM", "Error deleting script " + file.getPath(), e2);
                                    break;
                                }
                            }
                    }
/* 112 */           return ooiIlOl1iI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public Ol0o0I01iIO(Ol0o1OiOIIIl ol0o1OiOIIIl, Ol0ioI1iI ol0ioI1iI, String str, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iiI = ol0o1OiOIIIl;
                    this.I00iiO = ol0ioI1iI;
                    this.I00iio = str;
                }
            }
