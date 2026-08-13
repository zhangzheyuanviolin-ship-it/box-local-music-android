            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            
            public final class lIIo1l extends Io0OoIoOo {
                @Override
                public final IInterface I00000oOI(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
                    return iInterfaceQueryLocalInterface instanceof lIIl1lol0iOI ? (lIIl1lol0iOI) iInterfaceQueryLocalInterface : new lIIl1lol0iOI(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 11);
                }

                @Override
                public final IlIII1l[] I0001Ioi1lo() {
/* 1 */             return iO1lI0Oi.I0000O;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 9410000;
                }

                @Override
                public final String I000lI() {
/* 1 */             return "com.google.android.gms.phenotype.internal.IPhenotypeService";
                }

                @Override
                public final String I000o00OoI0I() {
/* 1 */             return "com.google.android.gms.phenotype.service.START";
                }
            }
