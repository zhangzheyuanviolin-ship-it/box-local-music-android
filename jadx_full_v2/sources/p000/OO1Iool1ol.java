            package p000;

            import android.view.textclassifier.TextClassifier;
            import android.view.textclassifier.TextSelection;
            import java.lang.invoke.VarHandle;
            
/* 13 */    public final class OO1Iool1ol extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public long I00iiI;
                public int I00iiO;
                public Object I00iio;
                public final long I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public final Object I00ioIO;
                public final Object I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OO1Iool1ol(Oii00o1ll oii00o1ll, OOo0o0oO oOo0o0oO, long j, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00ioIO = oii00o1ll;
/* 6 */             this.I00l0I0l0lO1 = oOo0o0oO;
/* 8 */             this.I00ilI0I1 = j;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00l0I0l0lO1;
/* 5 */             Object obj3 = this.I00ioIO;
                    switch (i) {
                        case 0:
/* 39 */                    OO1Iool1ol oO1Iool1ol = new OO1Iool1ol((CharSequence) obj2, this.I00ilI0I1, (OO1O0I) obj3, iOoil1iiIilo);
/* 42 */                    oO1Iool1ol.I00iio = obj;
/* 44 */                    return oO1Iool1ol;
                        default:
/* 21 */                    OO1Iool1ol oO1Iool1ol2 = new OO1Iool1ol((Oii00o1ll) obj3, (OOo0o0oO) obj2, this.I00ilI0I1, iOoil1iiIilo);
/* 24 */                    oO1Iool1ol2.I00iio = obj;
/* 26 */                    return oO1Iool1ol2;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 33 */                    return ((OO1Iool1ol) create((TextClassifier) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((OO1Iool1ol) create((OiOol0il0il) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    long jI00000oIO;
                    long j;
                    OI1I0OoOl oI1I0OoOl;
                    OloiIl oloiIl;
                    Oii00o1ll oii00o1ll;
                    OOo0o0oO oOo0o0oO;
                    long j2;
                    Oii00o1ll oii00o1ll2;
/* 1 */             int i = this.I00iOIl;
/* 4 */             long j3 = this.I00ilI0I1;
/* 6 */             Object obj2 = this.I00ioIO;
/* 10 */            Object obj3 = this.I00l0I0l0lO1;
/* 13 */            int i2 = 1;
                    switch (i) {
                        case 0:
/* 148 */                   OO1O0I oo1o0i = (OO1O0I) obj2;
/* 151 */                   CharSequence charSequence = (CharSequence) obj3;
/* 153 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 155 */                   int i3 = this.I00iiO;
/* 157 */                   if (i3 == 0) {
/* 195 */                       lIoii1l01l0i.I00000oOI(obj);
/* 200 */                       TextClassifier textClassifier = (TextClassifier) this.I00iio;
/* 219 */                       TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(charSequence, Oo0lI00l.I000II(j3), Oo0lI00l.I0001Ioi1lo(j3)).setDefaultLocales(oo1o0i.I0000Il00O());
/* 223 */                       defaultLocales.setIncludeTextClassification(true);
/* 230 */                       TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
/* 242 */                       jI00000oIO = lOliOi0Oi.I00000oIO(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
/* 250 */                       if (textSelectionSuggestSelection.getTextClassification() != null) {
/* 256 */                           OloiIl oloiIlI00000oOI = oo1o0i.I00000oOI(charSequence, jI00000oIO, textSelectionSuggestSelection.getTextClassification());
/* 260 */                           oI1I0OoOl = oo1o0i.I0000oI00;
/* 262 */                           this.I00iio = oloiIlI00000oOI;
/* 264 */                           this.I00ilO0 = oI1I0OoOl;
/* 266 */                           this.I00io1l = oo1o0i;
/* 268 */                           this.I00iiI = jI00000oIO;
/* 270 */                           this.I00iiO = 1;
/* 276 */                           if (oI1I0OoOl.I00000oIO(this) != ii0111o) {
/* 279 */                               oloiIl = oloiIlI00000oOI;
/* 282 */                               oo1o0i.I000II.setValue(oloiIl);
                                    }
                                } else {
/* 297 */                           this.I00iiI = jI00000oIO;
/* 299 */                           this.I00iiO = 2;
/* 309 */                           if (oo1o0i.I00000oIO((CharSequence) obj3, jI00000oIO, textClassifier, this) != ii0111o) {
/* 313 */                               j = jI00000oIO;
/* 314 */                               jI00000oIO = j;
                                    }
                                }
/* 311 */                       return ii0111o;
                            }
/* 159 */                   if (i3 == 1) {
/* 175 */                       long j4 = this.I00iiI;
/* 179 */                       OO1O0I oo1o0i2 = (OO1O0I) this.I00io1l;
/* 183 */                       oI1I0OoOl = (OI1I0OoOl) this.I00ilO0;
/* 187 */                       oloiIl = (OloiIl) this.I00iio;
/* 189 */                       lIoii1l01l0i.I00000oOI(obj);
/* 192 */                       jI00000oIO = j4;
/* 193 */                       oo1o0i = oo1o0i2;
                                try {
/* 282 */                           oo1o0i.I000II.setValue(oloiIl);
                                } finally {
/* 291 */                           oI1I0OoOl.I00000oOI(null);
                                }
                            } else {
/* 161 */                       if (i3 != 2) {
/* 170 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 163 */                       j = this.I00iiI;
/* 165 */                       lIoii1l01l0i.I00000oOI(obj);
/* 314 */                       jI00000oIO = j;
                            }
/* 315 */                   return Oo0lI00l.I00000oIO(jI00000oIO);
                        default:
/* 17 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 19 */                    int i4 = this.I00iiO;
/* 21 */                    if (i4 == 0) {
/* 47 */                        lIoii1l01l0i.I00000oOI(obj);
/* 52 */                        OiOol0il0il oiOol0il0il = (OiOol0il0il) this.I00iio;
/* 56 */                        oii00o1ll = (Oii00o1ll) obj2;
/* 58 */                        I0l0oI00l i0l0oI00l = new I0l0oI00l(i2);
/* 61 */                        i0l0oI00l.I00000oOI = oii00o1ll;
/* 63 */                        i0l0oI00l.I0000Il00O = oiOol0il0il;
/* 65 */                        VarHandle.storeStoreFence();
/* 69 */                        OOo0o0oO oOo0o0oO2 = (OOo0o0oO) obj3;
/* 71 */                        IlOIll0o11Ii ilOIll0o11Ii = oii00o1ll.I0000Il00O;
/* 73 */                        long j5 = oOo0o0oO2.I00iOIl;
/* 90 */                        float fI0000oI00 = oii00o1ll.I0000oI00(oii00o1ll.I0000O == OIilII.I00iiI ? OooIOilolOo.I0000Il00O(j3) : OooIOilolOo.I0000O(j3));
/* 94 */                        this.I00iio = oii00o1ll;
/* 96 */                        this.I00ilO0 = oii00o1ll;
/* 98 */                        this.I00io1l = oOo0o0oO2;
/* 100 */                       this.I00iiI = j5;
/* 102 */                       this.I00iiO = 1;
/* 104 */                       Object objI00000oIO = ilOIll0o11Ii.I00000oIO(i0l0oI00l, fI0000oI00, this);
/* 108 */                       if (objI00000oIO == ii0111o2) {
/* 110 */                           return ii0111o2;
                                }
/* 112 */                       oOo0o0oO = oOo0o0oO2;
/* 113 */                       j2 = j5;
/* 114 */                       obj = objI00000oIO;
/* 115 */                       oii00o1ll2 = oii00o1ll;
                            } else {
/* 23 */                        if (i4 != 1) {
/* 43 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 25 */                        j2 = this.I00iiI;
/* 29 */                        oOo0o0oO = (OOo0o0oO) this.I00io1l;
/* 33 */                        oii00o1ll = (Oii00o1ll) this.I00ilO0;
/* 37 */                        oii00o1ll2 = (Oii00o1ll) this.I00iio;
/* 39 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 122 */                   float fI0000oI002 = oii00o1ll2.I0000oI00(((Number) obj).floatValue());
/* 142 */                   oOo0o0oO.I00iOIl = oii00o1ll.I0000O == OIilII.I00iiI ? OooIOilolOo.I00000oOI(j2, fI0000oI002, 0.0f, 2) : OooIOilolOo.I00000oOI(j2, 0.0f, fI0000oI002, 1);
/* 144 */                   return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public OO1Iool1ol(CharSequence charSequence, long j, OO1O0I oo1o0i, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00l0I0l0lO1 = charSequence;
                    this.I00ilI0I1 = j;
                    this.I00ioIO = oo1o0i;
                }
            }
