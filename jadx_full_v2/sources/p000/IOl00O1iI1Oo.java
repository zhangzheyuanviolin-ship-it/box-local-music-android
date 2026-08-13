            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import kotlin.Metadata;
            
            @OII1IiiII("composable")
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LIOl00O1iI1Oo;", "LOII1Il1IlOO;", "LIOiooil;", "<init>", "()V", "navigation-compose_release"}, m18k = 1, mv = {2, 0, 0}, xi = 48)
            public final class IOl00O1iI1Oo extends OII1Il1IlOO {
                public final OIooliIO0 I0000Il00O = lOO00IiI0li.I00000oIO(Boolean.FALSE);

                @Override
                public final OI1ilOI1ioo0 I00000oIO() {
/* 5 */             return new IOiooil(this, IOiiiloolo.I00000oIO);
                }

                @Override
                public final void I0000O(List list, OI1oooI oI1oooI) {
/* 3 */             Iterator it = list.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) it.next();
/* 19 */                OI1Ooo oI1OooI00000oOI = I00000oOI();
/* 23 */                OOli1O oOli1O = oI1OooI00000oOI.I0000oI00;
/* 25 */                OlO0OIIl1 olO0OIIl1 = oI1OooI00000oOI.I0000Il00O;
/* 31 */                Iterable iterable = (Iterable) olO0OIIl1.getValue();
/* 35 */                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
/* 47 */                    Iterator it2 = iterable.iterator();
                            while (true) {
/* 55 */                        if (!it2.hasNext()) {
                                    break;
                                }
/* 63 */                        if (((OI1OloOIO1O) it2.next()) == oI1OloOIO1O) {
/* 71 */                            Iterable iterable2 = (Iterable) oOli1O.I00iOIl.getValue();
/* 75 */                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
/* 87 */                                Iterator it3 = iterable2.iterator();
/* 95 */                                while (it3.hasNext()) {
/* 103 */                                   if (((OI1OloOIO1O) it3.next()) == oI1OloOIO1O) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
/* 118 */               OI1OloOIO1O oI1OloOIO1O2 = (OI1OloOIO1O) IOOi0Ool1i.I00IoIO0lI((List) oOli1O.I00iOIl.getValue());
/* 121 */               if (oI1OloOIO1O2 != null) {
/* 133 */                   olO0OIIl1.I000lI(null, Oio0lI.I0001Ioi1lo((Set) olO0OIIl1.getValue(), oI1OloOIO1O2));
                        }
/* 146 */               olO0OIIl1.I000lI(null, Oio0lI.I0001Ioi1lo((Set) olO0OIIl1.getValue(), oI1OloOIO1O));
/* 149 */               oI1OooI00000oOI.I0000oI00(oI1OloOIO1O);
                    }
/* 158 */           this.I0000Il00O.setValue(Boolean.FALSE);
                }

                @Override
                public final void I0000oI00(OI1OloOIO1O oI1OloOIO1O, boolean z) {
/* 5 */             I00000oOI().I0000O(oI1OloOIO1O, z);
/* 12 */            this.I0000Il00O.setValue(Boolean.TRUE);
                }

                public final void I000II(OI1OloOIO1O oI1OloOIO1O) {
/* 1 */             OI1Ooo oI1OooI00000oOI = I00000oOI();
/* 5 */             OlO0OIIl1 olO0OIIl1 = oI1OooI00000oOI.I0000Il00O;
/* 18 */            olO0OIIl1.I000lI(null, Oio0lI.I0001Ioi1lo((Set) olO0OIIl1.getValue(), oI1OloOIO1O));
/* 31 */            if (oI1OooI00000oOI.I000O01llI0.I00000oOI.I0001Ioi1lo.contains(oI1OloOIO1O)) {
/* 35 */                oI1OloOIO1O.I00000oIO(O0oOi0I.I00iio);
                    } else {
/* 41 */                I000II.I001IO000("Cannot transition entry that is not in the back stack");
                    }
                }
            }
