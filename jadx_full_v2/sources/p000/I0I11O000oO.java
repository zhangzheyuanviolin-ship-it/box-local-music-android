            package p000;

            import android.view.View;
            import androidx.appcompat.view.menu.ActionMenuItemView;
            
/* 8 */     public final class I0I11O000oO extends Ill00I1oio {
                public final int I00l0OO0IO = 1;
                public final View I00li1OI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0I11O000oO(ActionMenuItemView actionMenuItemView) {
/* 6 */             super(actionMenuItemView);
/* 4 */             this.I00li1OI = actionMenuItemView;
                }

                @Override
                public final Ol01O0lOO I00000oOI() {
                    I0I1IlI1 i0I1IlI1;
/* 1 */             int i = this.I00l0OO0IO;
/* 4 */             View view = this.I00li1OI;
                    switch (i) {
                        case 0:
/* 25 */                    I0I11i0 i0I11i0 = ((ActionMenuItemView) view).I00ll1;
/* 27 */                    if (i0I11i0 == null || (i0I1IlI1 = ((I0I1Ol) i0I11i0).I00000oIO.I00oIiI10) == null) {
/* 3 */                         return null;
                            }
/* 37 */                    return i0I1IlI1.I00000oIO();
                        default:
/* 13 */                    I0I1IlI1 i0I1IlI12 = ((I0I1iI) view).I00iio.I00oII;
/* 15 */                    if (i0I1IlI12 == null) {
/* 3 */                         return null;
                            }
/* 18 */                    return i0I1IlI12.I00000oIO();
                    }
                }

                @Override
                public final boolean I0000Il00O() {
                    Ol01O0lOO ol01O0lOOI00000oOI;
/* 1 */             int i = this.I00l0OO0IO;
/* 4 */             View view = this.I00li1OI;
                    switch (i) {
                        case 0:
/* 17 */                    ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
/* 19 */                    O1ilOO o1ilOO = actionMenuItemView.I00l0OO0IO;
/* 21 */                    if (o1ilOO == null || !o1ilOO.I00000oIO(actionMenuItemView.I00io1l) || (ol01O0lOOI00000oOI = I00000oOI()) == null || !ol01O0lOOI00000oOI.I00000oIO()) {
                            }
                            break;
                        default:
/* 13 */                    ((I0I1iI) view).I00iio.I000l1();
                            break;
                    }
/* 3 */             return true;
                }

                @Override
                public boolean I0000O() {
                    switch (this.I00l0OO0IO) {
                        case 1:
/* 15 */                    I0I1ii0i i0I1ii0i = ((I0I1iI) this.I00li1OI).I00iio;
/* 19 */                    if (i0I1ii0i.I00oO101o != null) {
/* 21 */                        return false;
                            }
/* 23 */                    i0I1ii0i.I0001Ioi1lo();
/* 26 */                    return true;
                        default:
/* 6 */                     return super.I0000O();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public I0I11O000oO(I0I1iI i0I1iI, I0I1iI i0I1iI2) {
                    super(i0I1iI2);
/* 10 */            this.I00li1OI = i0I1iI;
                }
            }
