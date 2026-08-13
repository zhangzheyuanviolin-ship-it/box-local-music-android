            package p000;

            import com.box.gallery.MainActivity;
            
            public final class O1O1oo1lio1 implements IlOil1iooOO0 {
                public final int I00iOIl;
                public MainActivity I00iiI;

                public O1O1oo1lio1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 50 */                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 54 */                    MainActivity mainActivity = this.I00iiI;
/* 58 */                    if (!zBooleanValue) {
/* 72 */                        mainActivity.getWindow().setFlags(8192, 8192);
                                break;
                            } else {
/* 64 */                        mainActivity.getWindow().clearFlags(8192);
                                break;
                            }
                        case 1:
/* 44 */                    this.I00iiI.getWindow().getDecorView().setFilterTouchesWhenObscured(((Boolean) obj).booleanValue());
                            break;
                        default:
/* 24 */                    this.I00iiI.getWindow().getDecorView().setAccessibilityDataSensitive(((Boolean) obj).booleanValue() ? 1 : 0);
                            break;
                    }
/* 27 */            return ooiIlOl1iI;
                }
            }
