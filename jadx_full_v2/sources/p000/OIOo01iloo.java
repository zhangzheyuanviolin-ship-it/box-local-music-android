            package p000;
            
            public final class OIOo01iloo extends OII0l01IIOi {
                public I1lo101oIi1 I000O01llI0;
                public boolean I000OOo1O;

                @Override
                public final void I00000oIO() {
/* 1 */             I1lo101oIi1 i1lo101oIi1 = this.I000O01llI0;
                    switch (i1lo101oIi1.I0000O) {
                        case 0:
/* 13 */                    ((I01loIooI) i1lo101oIi1.I0000oI00).I0010o();
                            break;
                    }
                }

                @Override
                public final void I00000oOI() {
/* 1 */             I1lo101oIi1 i1lo101oIi1 = this.I000O01llI0;
                    switch (i1lo101oIi1.I0000O) {
                        case 0:
/* 56 */                    ((I01loIooI) i1lo101oIi1.I0000oI00).I00111O();
                            break;
                        case 1:
/* 26 */                    Ill1OlOOl ill1OlOOl = (Ill1OlOOl) i1lo101oIi1.I0000oI00;
/* 29 */                    ill1OlOOl.I001iOo1i0O(true);
/* 36 */                    if (!ill1OlOOl.I000O01llI0.I00000oOI) {
/* 48 */                        ill1OlOOl.I000II.I00000oOI().I00000oIO();
                                break;
                            } else {
/* 38 */                        ill1OlOOl.I00Iooi00oi();
                                break;
                            }
                        case 2:
/* 20 */                    ((OI1o1o1iO1l) i1lo101oIi1.I0000oI00).I0000oI00();
                            break;
                        default:
/* 12 */                    ((I0o0o0) i1lo101oIi1.I0000oI00).invoke(i1lo101oIi1);
                            break;
                    }
                }

                @Override
                public final void I0000Il00O(OII0l0 oII0l0) {
/* 1 */             I1lo101oIi1 i1lo101oIi1 = this.I000O01llI0;
/* 5 */             I1lloOo i1lloOo = new I1lloOo(oII0l0);
                    switch (i1lo101oIi1.I0000O) {
                        case 0:
/* 18 */                    ((I01loIooI) i1lo101oIi1.I0000oI00).I001IIilI0O(i1lloOo);
                            break;
                    }
                }

                @Override
                public final void I0000O(OII0l0 oII0l0) {
/* 1 */             I1lo101oIi1 i1lo101oIi1 = this.I000O01llI0;
/* 5 */             new I1lloOo(oII0l0);
                    switch (i1lo101oIi1.I0000O) {
                        case 0:
/* 18 */                    ((I01loIooI) i1lo101oIi1.I0000oI00).I001IO000();
                            break;
                    }
                }

                public final void I000O01llI0(boolean z) {
/* 1 */             this.I000OOo1O = z;
/* 14 */            I000II(z && this.I000O01llI0.I00000oOI);
                }
            }
