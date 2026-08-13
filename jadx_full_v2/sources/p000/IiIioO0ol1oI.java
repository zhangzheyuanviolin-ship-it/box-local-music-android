            package p000;
            
            public abstract class IiIioO0ol1oI extends O1ooOo {
                public final int I00o0iI0io1 = OIIlOOiIlo.I0000oI00(this);
                public O1ooOo I00o0l1o1o0;

                @Override
                public final void I0100i() {
/* 1 */             super.I0100i();
/* 6 */             for (O1ooOo o1ooOo = this.I00o0l1o1o0; o1ooOo != null; o1ooOo = o1ooOo.I00ilO0) {
/* 10 */                o1ooOo.I010l10O(this.I00ioIO);
/* 15 */                if (!o1ooOo.I00lll10) {
/* 17 */                    o1ooOo.I0100i();
                        }
                    }
                }

                @Override
                public final void I0100o111I() {
/* 3 */             for (O1ooOo o1ooOo = this.I00o0l1o1o0; o1ooOo != null; o1ooOo = o1ooOo.I00ilO0) {
/* 5 */                 o1ooOo.I0100o111I();
                    }
/* 11 */            super.I0100o111I();
                }

                @Override
                public final void I010OIo1l() {
/* 1 */             super.I010OIo1l();
/* 6 */             for (O1ooOo o1ooOo = this.I00o0l1o1o0; o1ooOo != null; o1ooOo = o1ooOo.I00ilO0) {
/* 8 */                 o1ooOo.I010OIo1l();
                    }
                }

                @Override
                public final void I010i10l() {
/* 3 */             for (O1ooOo o1ooOo = this.I00o0l1o1o0; o1ooOo != null; o1ooOo = o1ooOo.I00ilO0) {
/* 5 */                 o1ooOo.I010i10l();
                    }
/* 11 */            super.I010i10l();
                }

                @Override
                public final void I010iIIOlo() {
/* 1 */             super.I010iIIOlo();
/* 6 */             for (O1ooOo o1ooOo = this.I00o0l1o1o0; o1ooOo != null; o1ooOo = o1ooOo.I00ilO0) {
/* 8 */                 o1ooOo.I010iIIOlo();
                    }
                }

                @Override
                public final void I010ioo(O1ooOo o1ooOo) {
/* 1 */             this.I00iOIl = o1ooOo;
/* 5 */             for (O1ooOo o1ooOo2 = this.I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 7 */                 o1ooOo2.I010ioo(o1ooOo);
                    }
                }

                @Override
                public final void I010l10O(OIIlIII0Ili oIIlIII0Ili) {
/* 1 */             this.I00ioIO = oIIlIII0Ili;
/* 5 */             for (O1ooOo o1ooOo = this.I00o0l1o1o0; o1ooOo != null; o1ooOo = o1ooOo.I00ilO0) {
/* 7 */                 o1ooOo.I010l10O(oIIlIII0Ili);
                    }
                }

                public final IiIill0O0li1 I010l1O(IiIill0O0li1 iiIill0O0li1) {
/* 4 */             O1ooOo o1ooOo = ((O1ooOo) iiIill0O0li1).I00iOIl;
/* 7 */             if (o1ooOo != iiIill0O0li1) {
/* 17 */                O1ooOo o1ooOo2 = iiIill0O0li1 instanceof O1ooOo ? (O1ooOo) iiIill0O0li1 : null;
/* 23 */                O1ooOo o1ooOo3 = o1ooOo2 != null ? o1ooOo2.I00ilI0I1 : null;
/* 26 */                if (o1ooOo != this.I00iOIl || !O0000Ioio00.I0000O(o1ooOo3, this)) {
/* 38 */                    I000II.I001IO000("Cannot delegate to an already delegated node");
/* 6 */                     return null;
                        }
                    } else {
/* 44 */                if (o1ooOo.I00lll10) {
/* 48 */                    IolioOO1.I0000Il00O("Cannot delegate to an already attached node");
                        }
/* 53 */                o1ooOo.I010ioo(this.I00iOIl);
/* 56 */                int i = this.I00iiO;
/* 58 */                int iI0001Ioi1lo = OIIlOOiIlo.I0001Ioi1lo(o1ooOo);
/* 62 */                o1ooOo.I00iiO = iI0001Ioi1lo;
/* 64 */                int i2 = this.I00iiO;
/* 66 */                int i3 = iI0001Ioi1lo & 2;
/* 68 */                if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof O0iOoioOoI)) {
/* 100 */                   IolioOO1.I0000Il00O("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + o1ooOo);
                        }
/* 105 */               o1ooOo.I00ilO0 = this.I00o0l1o1o0;
/* 107 */               this.I00o0l1o1o0 = o1ooOo;
/* 109 */               o1ooOo.I00ilI0I1 = this;
/* 115 */               I010lI0oi(iI0001Ioi1lo | this.I00iiO, false);
/* 120 */               if (this.I00lll10) {
/* 122 */                   if (i3 == 0 || (i & 2) != 0) {
/* 146 */                       I010l10O(this.I00ioIO);
                            } else {
/* 133 */                       IIlOoolol0ll iIlOoolol0ll = il0lI1i1olii.I000O01llI0(this).I010101Oo1lO;
/* 137 */                       this.I00iOIl.I010l10O(null);
/* 140 */                       iIlOoolol0ll.I00100o1O0lo();
                            }
/* 149 */                   o1ooOo.I0100i();
/* 152 */                   o1ooOo.I010i10l();
/* 157 */                   if (!o1ooOo.I00lll10) {
/* 161 */                       IolioOO1.I0000Il00O("autoInvalidateInsertedNode called on unattached node");
                            }
/* 166 */                   OIIlOOiIlo.I00000oIO(o1ooOo, -1, 1);
                        }
                    }
/* 437 */           return iiIill0O0li1;
                }

                public final void I010l1ol111(IiIill0O0li1 iiIill0O0li1) {
/* 4 */             O1ooOo o1ooOo = null;
/* 5 */             for (O1ooOo o1ooOo2 = this.I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 7 */                 if (o1ooOo2 == iiIill0O0li1) {
/* 9 */                     boolean z = o1ooOo2.I00lll10;
/* 12 */                    if (z) {
/* 14 */                        OI0o11I1 oI0o11I1 = OIIlOOiIlo.I00000oIO;
/* 16 */                        if (!z) {
/* 20 */                            IolioOO1.I0000Il00O("autoInvalidateRemovedNode called on unattached node");
                                }
/* 24 */                        OIIlOOiIlo.I00000oIO(o1ooOo2, -1, 2);
/* 27 */                        o1ooOo2.I010iIIOlo();
/* 30 */                        o1ooOo2.I0100o111I();
                            }
/* 33 */                    o1ooOo2.I010ioo(o1ooOo2);
/* 37 */                    o1ooOo2.I00iio = 0;
/* 39 */                    O1ooOo o1ooOo3 = o1ooOo2.I00ilO0;
/* 41 */                    if (o1ooOo == null) {
/* 43 */                        this.I00o0l1o1o0 = o1ooOo3;
                            } else {
/* 46 */                        o1ooOo.I00ilO0 = o1ooOo3;
                            }
/* 48 */                    o1ooOo2.I00ilO0 = null;
/* 50 */                    o1ooOo2.I00ilI0I1 = null;
/* 52 */                    int i = this.I00iiO;
/* 54 */                    int iI0001Ioi1lo = OIIlOOiIlo.I0001Ioi1lo(this);
/* 59 */                    I010lI0oi(iI0001Ioi1lo, true);
/* 64 */                    if (this.I00lll10 && (i & 2) != 0 && (iI0001Ioi1lo & 2) == 0) {
/* 78 */                        IIlOoolol0ll iIlOoolol0ll = il0lI1i1olii.I000O01llI0(this).I010101Oo1lO;
/* 82 */                        this.I00iOIl.I010l10O(null);
/* 85 */                        iIlOoolol0ll.I00100o1O0lo();
/* 88 */                        return;
                            }
/* 88 */                    return;
                        }
/* 92 */                o1ooOo = o1ooOo2;
                    }
/* 97 */            IOOlIIilOl0.I000lI("Could not find delegate: ", iiIill0O0li1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v1, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r2v5 */
                /* JADX WARN: Type inference failed for: r2v6 */
                public final void I010lI0oi(int i, boolean z) {
                    O1ooOo o1ooOo;
/* 1 */             int i2 = this.I00iiO;
/* 3 */             this.I00iiO = i;
/* 5 */             if (i2 != i) {
/* 7 */                 O1ooOo o1ooOo2 = this.I00iOIl;
/* 9 */                 if (o1ooOo2 == this) {
/* 11 */                    this.I00iio = i;
                        }
/* 13 */                boolean z2 = this.I00lll10;
                        ?? r2 = this;
/* 15 */                if (z2) {
/* 17 */                    while (r2 != 0) {
/* 21 */                        i |= r2.I00iiO;
/* 22 */                        r2.I00iiO = i;
/* 24 */                        if (r2 == o1ooOo2) {
                                    break;
                                } else {
/* 26 */                            r2 = r2.I00ilI0I1;
                                }
                            }
/* 29 */                    if (z && r2 == o1ooOo2) {
/* 33 */                        i = OIIlOOiIlo.I0001Ioi1lo(o1ooOo2);
/* 37 */                        o1ooOo2.I00iiO = i;
                            }
/* 49 */                    int i3 = i | ((r2 == 0 || (o1ooOo = r2.I00ilO0) == null) ? 0 : o1ooOo.I00iio);
/* 50 */                    for (O1ooOo o1ooOo3 = r2; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilI0I1) {
/* 54 */                        i3 |= o1ooOo3.I00iiO;
/* 55 */                        o1ooOo3.I00iio = i3;
                            }
                        }
                    }
                }
            }
