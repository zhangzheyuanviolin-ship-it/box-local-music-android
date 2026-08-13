            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class Il0o1ll implements Il1oilii {
                @Override
                public final int I00000oIO() {
/* 1 */             return 2;
                }

                @Override
                public final int I00000oOI(IIiIoIl11IO iIiIoIl11IO, IIiIoIl11IO iIiIoIl11IO2, OI000ilOol oI000ilOol) {
/* 3 */             if (!(iIiIoIl11IO2 instanceof O00loo1i111O)) {
/* 230 */               return 3;
                    }
/* 6 */             O00loo1i111O o00loo1i111O = (O00loo1i111O) iIiIoIl11IO2;
/* 18 */            if (!o00loo1i111O.getTypeParameters().isEmpty()) {
/* 230 */               return 3;
                    }
/* 22 */            OIlIl0ilIo oIlIl0ilIoI000OOo1O = OIlIlOllioi.I000OOo1O(iIiIoIl11IO, iIiIoIl11IO2);
/* 35 */            if ((oIlIl0ilIoI000OOo1O != null ? oIlIl0ilIoI000OOo1O.I00000oOI() : 0) != 0) {
/* 230 */               return 3;
                    }
/* 53 */            OoI10o0iO11O ooI10o0iO11O = new OoI10o0iO11O(IOOi0Ool1i.I001IO000(o00loo1i111O.I00Iooi00oi()), IiOi0I1.I00ilI0I1);
/* 56 */            O0iIl1 o0iIl1 = o00loo1i111O.I00io1l;
/* 61 */            I1Iolliil0i i1Iolliil0i = new I1Iolliil0i(5);
/* 64 */            i1Iolliil0i.I00000oOI = o0iIl1;
/* 66 */            VarHandle.storeStoreFence();
/* 81 */            IlOIIioI1 ilOIIioI1I000O01llI0 = OilO1oiooiII.I000O01llI0(I1IoiO1l.I0000Il00O(new OilO0iOl[]{ooI10o0iO11O, i1Iolliil0i}));
/* 85 */            O0ioOi0Oo1ii o0ioOi0Oo1ii = o00loo1i111O.I00l0I0l0lO1;
/* 119 */           Iterator it = OilO1oiooiII.I000O01llI0(I1IoiO1l.I0000Il00O(new OilO0iOl[]{ilOIIioI1I000O01llI0, IOOi0Ool1i.I001IO000(IOOi1I.I000OOo1O(o0ioOi0Oo1ii != null ? o0ioOi0Oo1ii.getType() : null))})).iterator();
                    while (true) {
/* 124 */               IlIloII10O ilIloII10O = (IlIloII10O) it;
/* 130 */               if (!ilIloII10O.hasNext()) {
/* 173 */                   IIiIoIl11IO iIiIoIl11IOBuild = (IIiIoIl11IO) iIiIoIl11IO.I0000oI00(new OoOilII0(new OOlI1oo1l1()));
/* 175 */                   if (iIiIoIl11IOBuild == null) {
/* 230 */                       return 3;
                            }
/* 180 */                   if (iIiIoIl11IOBuild instanceof Ol0IioOo) {
/* 183 */                       Ol0IioOo ol0IioOo = (Ol0IioOo) iIiIoIl11IOBuild;
/* 195 */                       if (!ol0IioOo.getTypeParameters().isEmpty()) {
/* 205 */                           iIiIoIl11IOBuild = ol0IioOo.I00iio().I000lI().build();
                                }
                            }
                            return Il0o11.I00000oIO[IIlIOloOOO.I001lIiIIo1O(OIlIlOllioi.I0000Il00O.I000o00OoI0I(iIiIoIl11IOBuild, iIiIoIl11IO2, false).I00000oOI())] == 1 ? 1 : 3;
                        }
/* 136 */               O0iIl1 o0iIl12 = (O0iIl1) ilIloII10O.next();
/* 148 */               if (!o0iIl12.I00OIl().isEmpty() && !(o0iIl12.I00l0OO0IO() instanceof OOlIIOoli)) {
/* 230 */                   return 3;
                        }
                    }
                }
            }
