            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import android.util.Log;
            
            public final class io0ooO000l1i extends i1IIiIiiII {
                public final IBinder I000II;
                public final I1oIol10O I000O01llI0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public io0ooO000l1i(I1oIol10O i1oIol10O, int i, IBinder iBinder, Bundle bundle) {
/* 3 */             super(i1oIol10O, i, bundle);
/* 1 */             this.I000O01llI0 = i1oIol10O;
/* 6 */             this.I000II = iBinder;
                }

                @Override
                public final boolean I00000oIO() throws RemoteException {
/* 3 */             IBinder iBinder = this.I000II;
                    try {
/* 6 */                 lII0I0I000I.I000II(iBinder);
/* 12 */                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
/* 16 */                I1oIol10O i1oIol10O = this.I000O01llI0;
/* 26 */                if (!i1oIol10O.I000lI().equals(interfaceDescriptor)) {
/* 28 */                    String strI000lI = i1oIol10O.I000lI();
/* 60 */                    Log.w("GmsClient", IIl001iO0Io.I00100o1O0lo(new StringBuilder(strI000lI.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strI000lI, " vs. ", interfaceDescriptor));
/* 5 */                     return false;
                        }
/* 64 */                IInterface iInterfaceI00000oOI = i1oIol10O.I00000oOI(iBinder);
/* 68 */                if (iInterfaceI00000oOI == null || !(i1oIol10O.I00111O(2, 4, iInterfaceI00000oOI) || i1oIol10O.I00111O(3, 4, iInterfaceI00000oOI))) {
/* 5 */                     return false;
                        }
/* 86 */                i1oIol10O.I001IIilI0O = null;
/* 88 */                I1oIlIIIiOo0 i1oIlIIIiOo0 = i1oIol10O.I000oI1ioi;
/* 90 */                if (i1oIlIIIiOo0 == null) {
/* 95 */                    return true;
                        }
/* 92 */                i1oIlIIIiOo0.I0000oI00();
/* 95 */                return true;
                    } catch (RemoteException unused) {
/* 100 */               Log.w("GmsClient", "service probably died");
/* 5 */                 return false;
                    }
                }

                @Override
                public final void I00000oOI(IOlo10lO1iOl iOlo10lO1iOl) {
/* 3 */             I1oIlOi11 i1oIlOi11 = this.I000O01llI0.I00100l0;
/* 5 */             if (i1oIlOi11 != null) {
/* 7 */                 i1oIlOi11.I00000oOI(iOlo10lO1iOl);
                    }
/* 10 */            System.currentTimeMillis();
                }
            }
