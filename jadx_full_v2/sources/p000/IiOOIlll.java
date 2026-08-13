            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.util.List;
            
/* 45 */    public final class IiOOIlll extends I011olOoO {
                public static final O0O00I1Ili[] I00ilO0;
                public final O0iIl1 I00iiI;
                public final boolean I00iiO;
                public final OOoOiOo01lo I00iio;
                public final OOoOiOo01lo I00ilI0I1;

                static {
/* 10 */            OOOOIO0i oOOOIO0i = new OOOOIO0i(IiOOIlll.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
/* 13 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 35 */            I00ilO0 = new O0O00I1Ili[]{oOoOl1001II.I000O01llI0(oOOOIO0i), IIl001iO0Io.I0001Ioi1lo(IiOOIlll.class, "arguments", "getArguments()Ljava/util/List;", 0, oOoOl1001II)};
                }

                public IiOOIlll(O0iIl1 o0iIl1, IllOOo00lI illOOo00lI, boolean z) {
/* 1 */             super(illOOo00lI);
/* 4 */             this.I00iiI = o0iIl1;
/* 6 */             this.I00iiO = z;
/* 11 */            IiOOI00iI iiOOI00iI = new IiOOI00iI(0);
/* 14 */            iiOOI00iI.I00iiI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 24 */            this.I00iio = lIlo0Oi0oOI.I00000oIO(null, iiOOI00iI);
/* 30 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(11);
/* 33 */            i01illiil1Oo.I00iiO = this;
/* 35 */            i01illiil1Oo.I00iiI = illOOo00lI;
/* 37 */            VarHandle.storeStoreFence();
/* 44 */            this.I00ilI0I1 = lIlo0Oi0oOI.I00000oIO(null, i01illiil1Oo);
                }

                @Override
                public final O0O01O0o I00000oIO() {
/* 3 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = this.I00iiI.I00l0OO0IO();
/* 15 */            I00i0O i00i0O = ooioo0o1l0I00l0OO0IO instanceof I00i0O ? (I00i0O) ooioo0o1l0I00l0OO0IO : null;
/* 21 */            Ol0O0iI0l0O ol0O0iI0l0O = i00i0O != null ? i00i0O.I00iiO : null;
/* 22 */            if (ol0O0iI0l0O != null) {
/* 29 */                return new IiOOIlll(ol0O0iI0l0O, this.I00iOIl, true);
                    }
/* 9 */             return null;
                }

                @Override
                public final O0IOli0o0 I0000O() {
/* 7 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = this.I00iiI.I00iOIl().I00100o1O0lo();
/* 19 */            OI000ilOol oI000ilOol = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : null;
/* 20 */            if (oI000ilOol != null) {
/* 23 */                String str = O00oO0liO11.I00000oIO;
/* 35 */                if (O00oO0liO11.I000OiO.containsKey(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol))) {
/* 40 */                    if (!OllOoiO.I00000oIO) {
/* 94 */                        return l1i1iiO0OII.I00000oIO(IiOiOOIo.I000II(oI000ilOol), (O0IOli0o0) I001IIilI0O());
                            }
/* 48 */                    O0IOli0o0 o0IOli0o0 = (O0IOli0o0) I001IIilI0O();
/* 56 */                    String str2 = IiOiOOIo.I000II(oI000ilOol).I00000oIO.I00000oIO;
/* 61 */                    IiOOI0O iiOOI0O = new IiOOI0O(0);
/* 64 */                    iiOOI0O.I00iiI = oI000ilOol;
/* 66 */                    VarHandle.storeStoreFence();
/* 72 */                    IiOOI0O iiOOI0O2 = new IiOOI0O(1);
/* 75 */                    iiOOI0O2.I00iiI = oI000ilOol;
/* 77 */                    VarHandle.storeStoreFence();
/* 80 */                    return new OI0l0000lOo(o0IOli0o0, str2, iiOOI0O, iiOOI0O2);
                        }
                    }
/* 13 */            return null;
                }

                @Override
                public final boolean I000l1() {
/* 7 */             return this.I00iiI.I00l0OO0IO() instanceof IiIiOIi0;
                }

                @Override
                public final boolean I000lI() {
/* 3 */             return this.I00iiI.I00iiI();
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             O0iIl1 o0iIl1 = this.I00iiI;
/* 3 */             if (o0iIl1 != null) {
/* 5 */                 OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 9 */                 return O0i1lI0o1io.I001lIiIIo1O(o0iIl1, OlIllOO11lOl.I00000oOI);
                    }
/* 16 */            O0i1lI0o1io.I00000oIO(138);
/* 29 */            throw null;
                }

                @Override
                public final boolean I0010I0i() {
/* 3 */             return this.I00iiI instanceof OOlIIOoli;
                }

                @Override
                public final List I00111O() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00ilO0[1];
/* 12 */            return (List) this.I00ilI0I1.invoke();
                }

                @Override
                public final O0IiIl0il I001IIilI0O() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00ilO0[0];
/* 12 */            return (O0IiIl0il) this.I00iio.invoke();
                }

                @Override
                public final boolean I001IO000() {
/* 7 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = this.I00iiI.I00iOIl().I00100o1O0lo();
/* 11 */            Illo0o illo0oI0000oI00 = null;
/* 12 */            if (iOIiO1lIl0lI00100o1O0lo != null && (iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol) && O0i1lI0o1io.I00IioO0OiOi(iOIiO1lIl0lI00100o1O0lo)) {
/* 26 */                int i = IiOiOOIo.I00000oIO;
/* 32 */                illo0oI0000oI00 = ilioooOo11.I0000oI00(IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo));
                    }
/* 38 */            return O0000Ioio00.I0000O(illo0oI0000oI00, Illo0liIIii.I0000Il00O);
                }

                @Override
                public final List I001iOo1i0O() {
/* 3 */             return Oolli0oi0.I00000oOI(this.I00iiI);
                }

                @Override
                public final I011olOoO I001l0I00() {
/* 3 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = this.I00iiI.I00l0OO0IO();
/* 9 */             if (ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io) {
/* 17 */                return new IiOOIlll(((IlOIOIi00io) ooioo0o1l0I00l0OO0IO).I00iiI);
                    }
/* 21 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x000f A[PHI: r3
                  0x000f: PHI (r3v8 O0iIl1) = (r3v4 O0iIl1), (r3v10 O0iIl1) binds: [B:13:0x001e, B:5:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final I011olOoO I001lIiIIo1O(boolean z) {
/* 1 */             O0iIl1 o0iIl1 = this.I00iiI;
/* 3 */             if (z) {
/* 10 */                O0iIl1 o0iIl1I0000O = lo1iloiI1.I0000O(o0iIl1.I00l0OO0IO(), true);
/* 14 */                if (o0iIl1I0000O != null) {
/* 16 */                    o0iIl1 = o0iIl1I0000O;
                        }
                    } else {
/* 26 */                IiIiOIi0 iiIiOIi0 = o0iIl1 instanceof IiIiOIi0 ? (IiIiOIi0) o0iIl1 : null;
/* 27 */                if (iiIiOIi0 != null && (o0iIl1I0000O = iiIiOIi0.I00iiI) != null) {
                        }
                    }
/* 39 */            return new IiOOIlll(o0iIl1, this.I00iOIl, false);
                }

                @Override
                public final I011olOoO I001lllioOl(boolean z) {
/* 1 */             O0iIl1 o0iIl1 = this.I00iiI;
                    return ((o0iIl1.I00l0OO0IO() instanceof IlOIOIi00io) || o0iIl1.I00iiI() != z) ? new IiOOIlll(OoOilo0Oliii.I000O01llI0(o0iIl1, z), this.I00iOIl, false) : this;
                }

                @Override
                public final I011olOoO I001lloI() {
/* 3 */             Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = this.I00iiI.I00l0OO0IO();
/* 9 */             if (ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io) {
/* 17 */                return new IiOOIlll(((IlOIOIi00io) ooioo0o1l0I00l0OO0IO).I00iiO);
                    }
/* 21 */            return null;
                }

                public final O0IiIl0il I00II0Ol1O0l(O0iIl1 o0iIl1) {
                    O0iIl1 o0iIl1I00000oOI;
/* 4 */             if (this.I00iiO) {
/* 10 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 21 */                OIIoolO0i oIIoolO0i = iOIiO1lIl0lI00100o1O0lo instanceof OIIoolO0i ? (OIIoolO0i) iOIiO1lIl0lI00100o1O0lo : null;
/* 22 */                if (oIIoolO0i != null) {
/* 30 */                    return new O0O01o1i(IiOiOOIo.I000II(oIIoolO0i));
                        }
                    }
/* 38 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = o0iIl1.I00iOIl().I00100o1O0lo();
/* 44 */            if (iOIiO1lIl0lI00100o1O0lo2 instanceof OI000ilOol) {
/* 48 */                Class clsI000O01llI0 = Oolli0oi0.I000O01llI0((OI000ilOol) iOIiO1lIl0lI00100o1O0lo2);
/* 52 */                if (clsI000O01llI0 != null) {
/* 60 */                    if (!O0i1lI0o1io.I001iOo1i0O(o0iIl1)) {
/* 133 */                       if (OoOilo0Oliii.I0000oI00(o0iIl1)) {
/* 155 */                           return new O0Ii1IOoiO(clsI000O01llI0);
                                }
/* 143 */                       Class cls = (Class) OOo1Io0I0.I00000oOI.get(clsI000O01llI0);
/* 145 */                       if (cls != null) {
/* 148 */                           clsI000O01llI0 = cls;
                                }
/* 149 */                       return new O0Ii1IOoiO(clsI000O01llI0);
                            }
/* 70 */                    OoOi1Ol ooOi1Ol = (OoOi1Ol) IOOi0Ool1i.I00Ol00(o0iIl1.I00OIl());
/* 72 */                    if (ooOi1Ol == null || (o0iIl1I00000oOI = ooOi1Ol.I00000oOI()) == null) {
/* 125 */                       return new O0Ii1IOoiO(clsI000O01llI0);
                            }
/* 86 */                    O0IiIl0il o0IiIl0ilI00II0Ol1O0l = I00II0Ol1O0l(OoOilo0Oliii.I000O01llI0(o0iIl1I00000oOI, true));
/* 90 */                    if (o0IiIl0ilI00II0Ol1O0l != null) {
/* 113 */                       return new O0Ii1IOoiO(Array.newInstance((Class<?>) ((IOIO10iOi1) l0ii0ooi.I00000oIO(o0IiIl0ilI00II0Ol1O0l)).I001l0I00(), 0).getClass());
                            }
/* 119 */                   IoOOl0iOl1io.I001IIilI0O("Cannot determine classifier for array element type: ", this);
/* 3 */                     return null;
                        }
                    } else if (iOIiO1lIl0lI00100o1O0lo2 instanceof OoOOiO) {
/* 167 */               return new O0O0iO(null, (OoOOiO) iOIiO1lIl0lI00100o1O0lo2);
                    }
/* 3 */             return null;
                }

                @Override
                public final boolean equals(Object obj) {
/* 3 */             if (!OllOoiO.I00000oIO) {
/* 53 */                return super.equals(obj);
                    }
/* 7 */             if (!(obj instanceof IiOOIlll)) {
/* 51 */                return false;
                    }
/* 9 */             IiOOIlll iiOOIlll = (IiOOIlll) obj;
                    return O0000Ioio00.I0000O(this.I00iiI, iiOOIlll.I00iiI) && O0000Ioio00.I0000O(I001IIilI0O(), iiOOIlll.I001IIilI0O()) && I00111O().equals(iiOOIlll.I00111O());
                }

                @Override
                public final int hashCode() {
/* 3 */             if (!OllOoiO.I00000oIO) {
/* 38 */                return super.hashCode();
                    }
/* 11 */            int iHashCode = this.I00iiI.hashCode() * 31;
/* 13 */            O0IiIl0il o0IiIl0ilI001IIilI0O = I001IIilI0O();
/* 36 */            return I00111O().hashCode() + ((iHashCode + (o0IiIl0ilI001IIilI0O != null ? o0IiIl0ilI001IIilI0O.hashCode() : 0)) * 31);
                }

/* 46 */        public IiOOIlll(O0iIl1 o0iIl1) {
/* 47 */            this(o0iIl1, null, false);
                }
            }
