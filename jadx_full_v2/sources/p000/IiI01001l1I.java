            package p000;

            import java.util.HashMap;
            import java.util.List;
            
/* 10 */    public final class IiI01001l1I implements O0oiIoI0 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public IiI01001l1I(IiI00001oI iiI00001oI, O0oiIoI0 o0oiIoI0) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiI = iiI00001oI;
/* 9 */             this.I00iiO = o0oiIoI0;
                }

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) throws NoSuchMethodException, SecurityException {
                    switch (this.I00iOIl) {
                        case 0:
/* 100 */                   IiI00001oI iiI00001oI = (IiI00001oI) this.I00iiI;
                            switch (IiI00o.I00000oIO[o0oOOiI0.ordinal()]) {
                                case 1:
                                    break;
                                case 2:
/* 139 */                           iiI00001oI.onStart(o0oiOi);
                                    break;
                                case 3:
/* 135 */                           iiI00001oI.onResume(o0oiOi);
                                    break;
                                case 4:
/* 131 */                           iiI00001oI.onPause(o0oiOi);
                                    break;
                                case 5:
/* 127 */                           iiI00001oI.onStop(o0oiOi);
                                    break;
                                case 6:
/* 123 */                           iiI00001oI.onDestroy(o0oiOi);
                                    break;
                                case 7:
/* 119 */                           I000II.I000iOII("ON_ANY must not been send by anybody");
                                    break;
                                default:
/* 113 */                           I000II.I00000oIO();
                                    break;
                            }
/* 144 */                   O0oiIoI0 o0oiIoI0 = (O0oiIoI0) this.I00iiO;
/* 146 */                   if (o0oiIoI0 != null) {
/* 148 */                       o0oiIoI0.I000II(o0oiOi, o0oOOiI0);
                                break;
                            }
                            break;
                        case 1:
/* 81 */                    if (o0oOOiI0 == O0oOOiI0.ON_START) {
/* 87 */                        ((I01O1lIi) this.I00iiI).I00ooIo0(this);
/* 94 */                        ((I1I0i0Ilo1Oi) this.I00iiO).I00Ol10();
                                break;
                            }
                            break;
                        case 2:
/* 39 */                    OIOo01iloo oIOo01iloo = (OIOo01iloo) this.I00iiI;
/* 47 */                    int i = OIOoO0i1.I00000oIO[o0oOOiI0.ordinal()];
/* 50 */                    if (i == 1) {
/* 75 */                        oIOo01iloo.I000O01llI0(true);
                                break;
                            } else if (i == 2) {
/* 71 */                        oIOo01iloo.I000O01llI0(false);
                                break;
                            } else if (i == 3) {
/* 59 */                        oIOo01iloo.I0001Ioi1lo();
/* 66 */                        ((I01O1lIi) this.I00iiO).I00ooIo0(this);
                                break;
                            }
                            break;
                        default:
/* 8 */                     IOIi11I01oO iOIi11I01oO = (IOIi11I01oO) this.I00iiO;
/* 12 */                    O0oiO0ilooli o0oiO0ilooli = (O0oiO0ilooli) this.I00iiI;
/* 14 */                    HashMap map = iOIi11I01oO.I00000oIO;
/* 22 */                    IOIi11I01oO.I00000oIO((List) map.get(o0oOOiI0), o0oiOi, o0oOOiI0, o0oiO0ilooli);
/* 33 */                    IOIi11I01oO.I00000oIO((List) map.get(O0oOOiI0.ON_ANY), o0oiOi, o0oOOiI0, o0oiO0ilooli);
                            break;
                    }
                }

/* 11 */        public IiI01001l1I(int i) {
/* 12 */            this.I00iOIl = i;
                }
            }
