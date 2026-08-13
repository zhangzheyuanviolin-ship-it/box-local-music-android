            package p000;

            import android.view.View;
            import android.view.ViewParent;
            import android.view.ViewTreeObserver;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Ili0oiOI1i10 extends O1ooOo implements Ili1l10, ViewTreeObserver.OnGlobalFocusChangeListener {
                public ViewTreeObserver I00o0iI0io1;
                public Ili0o0i I00o0l1o1o0;
                public Ili0o0i I00o101lO;

                @Override
                public final void I001lloI(Ili1l0 ili1l0) {
/* 2 */             ili1l0.I0000Il00O(false);
/* 7 */             ili1l0.I00000oOI(this.I00o0l1o1o0);
/* 12 */            ili1l0.I0000oI00(this.I00o101lO);
                }

                @Override
                public final void I010101Oo1lO() {
/* 5 */             ViewTreeObserver viewTreeObserver = il0lIIII.I00000oIO(this).getViewTreeObserver();
/* 9 */             this.I00o0iI0io1 = viewTreeObserver;
/* 11 */            viewTreeObserver.addOnGlobalFocusChangeListener(this);
                }

                @Override
                public final void I010I0() {
/* 1 */             ViewTreeObserver viewTreeObserver = this.I00o0iI0io1;
/* 3 */             if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
/* 11 */                viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                    }
/* 15 */            this.I00o0iI0io1 = null;
/* 25 */            il0lIIII.I00000oIO(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
                }

                public final IliIO10oO0 I010l1O() {
                    boolean z;
/* 5 */             if (!this.I00iOIl.I00lll10) {
/* 9 */                 IolioOO1.I0000Il00O("visitLocalDescendants called on an unattached node");
                    }
/* 12 */            O1ooOo o1ooOo = this.I00iOIl;
/* 19 */            if ((o1ooOo.I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 24 */                boolean z2 = false;
/* 25 */                for (O1ooOo o1ooOo2 = o1ooOo.I00ilO0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 31 */                    if ((o1ooOo2.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 33 */                        O1ooOo o1ooOoI0000Il00O = o1ooOo2;
/* 34 */                        OI110O0 oi110o0 = null;
/* 35 */                        while (o1ooOoI0000Il00O != null) {
/* 40 */                            if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 43 */                                IliIO10oO0 iliIO10oO0 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 45 */                                if (z2) {
/* 47 */                                    return iliIO10oO0;
                                        }
/* 48 */                                z = false;
/* 49 */                                z2 = true;
                                    } else {
/* 51 */                                z = true;
                                    }
/* 52 */                            if (z && (o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 69 */                                int i = 0;
/* 70 */                                for (O1ooOo o1ooOo3 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo3 != null; o1ooOo3 = o1ooOo3.I00ilO0) {
/* 76 */                                    if ((o1ooOo3.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 78 */                                        i++;
/* 80 */                                        if (i == 1) {
/* 82 */                                            o1ooOoI0000Il00O = o1ooOo3;
                                                } else {
/* 84 */                                            if (oi110o0 == null) {
/* 92 */                                                oi110o0 = new OI110O0(new O1ooOo[16]);
                                                    }
/* 95 */                                            if (o1ooOoI0000Il00O != null) {
/* 97 */                                                oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 100 */                                               o1ooOoI0000Il00O = null;
                                                    }
/* 101 */                                           oi110o0.I00000oOI(o1ooOo3);
                                                }
                                            }
                                        }
/* 107 */                               if (i == 1) {
                                        }
                                    }
/* 110 */                           o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                }
                            }
                        }
                    }
/* 120 */           I000II.I001IO000("Could not find focus target of embedded view wrapper");
/* 18 */            return null;
                }

                @Override
                public final void onGlobalFocusChanged(View view, View view2) {
                    boolean z;
/* 7 */             if (il0lI1i1olii.I000O01llI0(this).I00o0iI0io1 == null) {
/* 332 */               return;
                    }
/* 11 */            View viewI00000oIO = ili0OllOi.I00000oIO(this);
/* 21 */            Ili1iIl focusOwner = ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(this)).getFocusOwner();
/* 25 */            OIlO000O01 oIlO000O01I000OOo1O = il0lI1i1olii.I000OOo1O(this);
/* 29 */            boolean z2 = true;
/* 31 */            if (view == null || view.equals(oIlO000O01I000OOo1O)) {
/* 58 */                z = false;
                    } else {
/* 43 */                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
/* 49 */                    if (parent == viewI00000oIO.getParent()) {
/* 51 */                        z = true;
                                break;
                            }
                        }
/* 58 */                z = false;
                    }
/* 59 */            if (view2 == null || view2.equals(oIlO000O01I000OOo1O)) {
/* 85 */                z2 = false;
                    } else {
/* 71 */                for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
/* 77 */                    if (parent2 == viewI00000oIO.getParent()) {
                                break;
                            }
                        }
/* 85 */                z2 = false;
                    }
/* 86 */            if (z && z2) {
/* 332 */               return;
                    }
/* 91 */            if (z2) {
/* 93 */                IliIO10oO0 iliIO10oO0I010l1O = I010l1O();
/* 105 */               if (iliIO10oO0I010l1O.I01101IOlO().I00000oIO()) {
/* 332 */                   return;
                        }
/* 107 */               iliI01iIl.I0000O(iliIO10oO0I010l1O);
/* 110 */               return;
                    }
/* 111 */           if (z && I010l1O().I01101IOlO().I00000oOI()) {
/* 131 */               ((Ili1ioOlo0oO) focusOwner).I0000Il00O(8, false, false);
                    }
                }
            }
