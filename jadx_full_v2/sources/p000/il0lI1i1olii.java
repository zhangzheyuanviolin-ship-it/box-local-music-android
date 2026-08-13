            package p000;

            import android.graphics.Rect;
            
            public abstract class il0lI1i1olii {
                public static final void I00000oIO(OI110O0 oi110o0, O1ooOo o1ooOo) {
/* 5 */             OI110O0 oi110o0I001lIiIIo1O = I000O01llI0(o1ooOo).I001lIiIIo1O();
                    int i = oi110o0I001lIiIIo1O.I00iiO - 1;
/* 13 */            Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 16 */            if (i < objArr.length) {
/* 18 */                while (i >= 0) {
/* 30 */                    oi110o0.I00000oOI((O1ooOo) ((O0iiOioolIi) objArr[i]).I010101Oo1lO.I00io1l);
                            i--;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final O0iOoioOoI I00000oOI(O1ooOo o1ooOo) {
/* 6 */             if ((o1ooOo.I00iiO & 2) != 0) {
/* 10 */                if (o1ooOo instanceof O0iOoioOoI) {
/* 12 */                    return (O0iOoioOoI) o1ooOo;
                        }
/* 17 */                if (o1ooOo instanceof IiIioO0ol1oI) {
/* 21 */                    O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOo).I00o0l1o1o0;
/* 23 */                    while (o1ooOo2 != 0) {
/* 27 */                        if (o1ooOo2 instanceof O0iOoioOoI) {
/* 29 */                            return (O0iOoioOoI) o1ooOo2;
                                }
/* 47 */                        o1ooOo2 = (!(o1ooOo2 instanceof IiIioO0ol1oI) || (o1ooOo2.I00iiO & 2) == 0) ? o1ooOo2.I00ilO0 : ((IiIioO0ol1oI) o1ooOo2).I00o0l1o1o0;
                            }
                        }
                    }
/* 5 */             return null;
                }

                public static final O1ooOo I0000Il00O(OI110O0 oi110o0) {
                    int i;
/* 1 */             if (oi110o0 == null || (i = oi110o0.I00iiO) == 0) {
/* 17 */                return null;
                    }
/* 14 */            return (O1ooOo) oi110o0.I000l1(i - 1);
                }

                public static final void I0000O(IiIill0O0li1 iiIill0O0li1) {
                    I0lII0loi i0lII0loiM26getAutofillManager;
/* 1 */             O0iiOioolIi o0iiOioolIiI000O01llI0 = I000O01llI0(iiIill0O0li1);
/* 7 */             if (o0iiOioolIiI000O01llI0.I00oO101o || (i0lII0loiM26getAutofillManager = ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIiI000O01llI0)).m26getAutofillManager()) == null) {
/* 168 */               return;
                    }
/* 22 */            Rect rect = i0lII0loiM26getAutofillManager.I00ilO0;
/* 24 */            OOo0Olol0o oOo0Olol0o = i0lII0loiM26getAutofillManager.I00iio;
/* 34 */            O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) oOo0Olol0o.I00000oIO.I00000oOI(o0iiOioolIiI000O01llI0.I00iiI);
/* 36 */            if (o0iiOioolIi == null || o0iiOioolIi.I00io1l == -4) {
/* 168 */               return;
                    }
/* 43 */            I00Ol00 i00Ol00 = oOo0Olol0o.I0000Il00O;
/* 45 */            int iI0000O = oOo0Olol0o.I0000O(o0iiOioolIi);
/* 51 */            long[] jArr = (long[]) i00Ol00.I0000Il00O;
/* 53 */            long j = jArr[iI0000O];
/* 57 */            long j2 = jArr[iI0000O + 1];
/* 69 */            rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
/* 82 */            i0lII0loiM26getAutofillManager.I00iOIl.I00oIiI10().requestAutofill(i0lII0loiM26getAutofillManager.I00iiO, o0iiOioolIiI000O01llI0.I00iiI, rect);
                }

                public static final OIIlIII0Ili I0000oI00(IiIill0O0li1 iiIill0O0li1, int i) {
/* 6 */             OIIlIII0Ili oIIlIII0Ili = ((O1ooOo) iiIill0O0li1).I00iOIl.I00ioIO;
                    return (oIIlIII0Ili.I0110OiO() == iiIill0O0li1 && OIIlOOiIlo.I000II(i)) ? oIIlIII0Ili.I00olI : oIIlIII0Ili;
                }

                public static final Io10IIII I0001Ioi1lo(IiIill0O0li1 iiIill0O0li1) {
/* 7 */             return ((I0lio1O01i01) I000OOo1O(iiIill0O0li1)).getGraphicsContext();
                }

                public static final OIIlIII0Ili I000II(IiIill0O0li1 iiIill0O0li1) {
/* 8 */             if (!((O1ooOo) iiIill0O0li1).I00iOIl.I00lll10) {
/* 12 */                IolioOO1.I0000Il00O("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
                    }
/* 16 */            OIIlIII0Ili oIIlIII0IliI0000oI00 = I0000oI00(iiIill0O0li1, 2);
/* 26 */            if (!oIIlIII0IliI0000oI00.I0110OiO().I00lll10) {
/* 30 */                IolioOO1.I0000Il00O("LayoutCoordinates is not attached.");
                    }
/* 77 */            return oIIlIII0IliI0000oI00;
                }

                public static final O0iiOioolIi I000O01llI0(IiIill0O0li1 iiIill0O0li1) {
/* 5 */             OIIlIII0Ili oIIlIII0Ili = ((O1ooOo) iiIill0O0li1).I00iOIl.I00ioIO;
/* 7 */             if (oIIlIII0Ili != null) {
/* 9 */                 return oIIlIII0Ili.I00oO101o;
                    }
/* 29 */            throw IIlIOloOOO.I000OOo1O("Cannot obtain node coordinator. Is the Modifier.Node attached?");
                }

                public static final OIlO000O01 I000OOo1O(IiIill0O0li1 iiIill0O0li1) {
/* 5 */             OIlO000O01 oIlO000O01 = I000O01llI0(iiIill0O0li1).I00o0iI0io1;
/* 7 */             if (oIlO000O01 != null) {
/* 9 */                 return oIlO000O01;
                    }
/* 29 */            throw IIlIOloOOO.I000OOo1O("This node does not have an owner.");
                }
            }
