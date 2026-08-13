            package p000;

            import android.content.Intent;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.CancellationSignal;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Log;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.Executor;
            
            public class II0i11 extends Ill0l1 {
                public II0lI0lO1 I0110OiO;

                public II0i11() {
/* 10 */            new Handler(Looper.getMainLooper());
                }

                @Override
                public final void I001IIilI0O(int i, int i2, Intent intent) {
/* 1 */             super.I001IIilI0O(i, i2, intent);
/* 5 */             if (i == 1) {
/* 10 */                this.I0110OiO.I000iOII = false;
/* 13 */                if (i2 == -1) {
/* 21 */                    I00O0i0ii(new II0iil1(null, 1));
                        } else {
/* 34 */                    I00Iooi00oi(10, I000o00OoI0I(R.string.generic_error_user_canceled));
                        }
                    }
                }

                @Override
                public final void I001i1O0Ol(Bundle bundle) {
/* 1 */             super.I001i1O0Ol(bundle);
/* 7 */             if (this.I0110OiO == null) {
/* 17 */                II0lI0lO1 iI0lI0lO1 = null;
/* 25 */                Oool1Ii0I oool1Ii0II0001Ioi1lo = this.I00ilO0.getBoolean("host_activity", true) ? I0001Ioi1lo() : null;
/* 26 */                if (oool1Ii0II0001Ioi1lo == null) {
/* 28 */                    oool1Ii0II0001Ioi1lo = this.I00oO101o;
                        }
/* 30 */                if (oool1Ii0II0001Ioi1lo != null) {
/* 44 */                    iI0lI0lO1 = (II0lI0lO1) new Oool0iOoooIo(oool1Ii0II0001Ioi1lo).I00000oOI(II0lI0lO1.class);
                        } else {
/* 49 */                    I000II.I001IO000("view model not found");
                        }
/* 52 */                this.I0110OiO = iI0lI0lO1;
                    }
/* 60 */            new WeakReference(I0001Ioi1lo());
/* 63 */            II0lI0lO1 iI0lI0lO12 = this.I0110OiO;
/* 65 */            OI0lOii0I oI0lOii0I = iI0lI0lO12.I000l1;
/* 67 */            if (oI0lOii0I == null) {
/* 71 */                oI0lOii0I = new OI0lOii0I();
/* 74 */                iI0lI0lO12.I000l1 = oI0lOii0I;
                    }
/* 79 */            II0OlIl iI0OlIl = new II0OlIl(0);
/* 82 */            iI0OlIl.I00iiI = this;
/* 84 */            VarHandle.storeStoreFence();
/* 87 */            oI0lOii0I.I0000oI00(this, iI0OlIl);
/* 90 */            II0lI0lO1 iI0lI0lO13 = this.I0110OiO;
/* 92 */            OI0lOii0I oI0lOii0I2 = iI0lI0lO13.I000lI;
/* 94 */            if (oI0lOii0I2 == null) {
/* 98 */                oI0lOii0I2 = new OI0lOii0I();
/* 101 */               iI0lI0lO13.I000lI = oI0lOii0I2;
                    }
/* 105 */           II0OlIl iI0OlIl2 = new II0OlIl(1);
/* 108 */           iI0OlIl2.I00iiI = this;
/* 110 */           VarHandle.storeStoreFence();
/* 113 */           oI0lOii0I2.I0000oI00(this, iI0OlIl2);
/* 116 */           II0lI0lO1 iI0lI0lO14 = this.I0110OiO;
/* 118 */           OI0lOii0I oI0lOii0I3 = iI0lI0lO14.I000o00OoI0I;
/* 120 */           if (oI0lOii0I3 == null) {
/* 124 */               oI0lOii0I3 = new OI0lOii0I();
/* 127 */               iI0lI0lO14.I000o00OoI0I = oI0lOii0I3;
                    }
/* 132 */           II0OlIl iI0OlIl3 = new II0OlIl(2);
/* 135 */           iI0OlIl3.I00iiI = this;
/* 137 */           VarHandle.storeStoreFence();
/* 140 */           oI0lOii0I3.I0000oI00(this, iI0OlIl3);
/* 143 */           II0lI0lO1 iI0lI0lO15 = this.I0110OiO;
/* 145 */           OI0lOii0I oI0lOii0I4 = iI0lI0lO15.I000oI1ioi;
/* 147 */           if (oI0lOii0I4 == null) {
/* 151 */               oI0lOii0I4 = new OI0lOii0I();
/* 154 */               iI0lI0lO15.I000oI1ioi = oI0lOii0I4;
                    }
/* 159 */           II0OlIl iI0OlIl4 = new II0OlIl(3);
/* 162 */           iI0OlIl4.I00iiI = this;
/* 164 */           VarHandle.storeStoreFence();
/* 167 */           oI0lOii0I4.I0000oI00(this, iI0OlIl4);
/* 170 */           II0lI0lO1 iI0lI0lO16 = this.I0110OiO;
/* 172 */           OI0lOii0I oI0lOii0I5 = iI0lI0lO16.I00100l0;
/* 174 */           if (oI0lOii0I5 == null) {
/* 178 */               oI0lOii0I5 = new OI0lOii0I();
/* 181 */               iI0lI0lO16.I00100l0 = oI0lOii0I5;
                    }
/* 186 */           II0OlIl iI0OlIl5 = new II0OlIl(4);
/* 189 */           iI0OlIl5.I00iiI = this;
/* 191 */           VarHandle.storeStoreFence();
/* 194 */           oI0lOii0I5.I0000oI00(this, iI0OlIl5);
/* 197 */           II0lI0lO1 iI0lI0lO17 = this.I0110OiO;
/* 199 */           OI0lOii0I oI0lOii0I6 = iI0lI0lO17.I00100o1O0lo;
/* 201 */           if (oI0lOii0I6 == null) {
/* 205 */               oI0lOii0I6 = new OI0lOii0I();
/* 208 */               iI0lI0lO17.I00100o1O0lo = oI0lOii0I6;
                    }
/* 213 */           II0OlIl iI0OlIl6 = new II0OlIl(5);
/* 216 */           iI0OlIl6.I00iiI = this;
/* 218 */           VarHandle.storeStoreFence();
/* 221 */           oI0lOii0I6.I0000oI00(this, iI0OlIl6);
                }

                @Override
                public final void I00II0Ol1O0l() {
/* 2 */             this.I00ooiO1I = true;
                }

                @Override
                public final void I00II0oii1o() {
/* 2 */             this.I00ooiO1I = true;
                }

                public final void I00IoIO0lI(int i) {
/* 2 */             if (i != 3) {
/* 6 */                 this.I0110OiO.getClass();
                    }
/* 9 */             I00IoiI();
/* 12 */            II0lI0lO1 iI0lI0lO1 = this.I0110OiO;
/* 14 */            IoIlOo1o0IIl ioIlOo1o0IIl = iI0lI0lO1.I000II;
/* 16 */            if (ioIlOo1o0IIl == null) {
/* 22 */                ioIlOo1o0IIl = new IoIlOo1o0IIl(7, false);
/* 32 */                ioIlOo1o0IIl.I00iiI = new lolIo0(9);
/* 34 */                VarHandle.storeStoreFence();
/* 37 */                iI0lI0lO1.I000II = ioIlOo1o0IIl;
                    }
/* 41 */            CancellationSignal cancellationSignal = (CancellationSignal) ioIlOo1o0IIl.I00iiO;
/* 46 */            if (cancellationSignal != null) {
                        try {
/* 48 */                    IIoiII0iiOI.I00000oIO(cancellationSignal);
                        } catch (NullPointerException e) {
/* 55 */                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                        }
/* 58 */                ioIlOo1o0IIl.I00iiO = null;
                    }
/* 62 */            IIoi1Oi iIoi1Oi = (IIoi1Oi) ioIlOo1o0IIl.I00iio;
/* 64 */            if (iIoi1Oi != null) {
                        try {
/* 66 */                    iIoi1Oi.I00000oIO();
                        } catch (NullPointerException e2) {
/* 73 */                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                        }
/* 76 */                ioIlOo1o0IIl.I00iio = null;
                    }
                }

                public final void I00IoO0() {
/* 4 */             this.I0110OiO.I000OOo1O = false;
/* 11 */            if (I00100o1O0lo()) {
                    }
/* 25 */            II0lI0lO1 iI0lI0lO1 = this.I0110OiO;
/* 27 */            iI0lI0lO1.I000OOo1O = false;
/* 31 */            if (!iI0lI0lO1.I000iOII && I00100o1O0lo()) {
/* 45 */                I1loiIo i1loiIo = new I1loiIo(I000lI());
/* 48 */                i1loiIo.I000II(this);
/* 51 */                i1loiIo.I0000O(true);
                    }
/* 58 */            if (I000OiO() != null) {
/* 60 */                String str = Build.MODEL;
                    }
                }

                public final void I00IoiI() {
/* 5 */             if (I000OiO() == null || this.I0110OiO.I0000oI00 == null) {
/* 20 */                return;
                    }
/* 13 */            String str = Build.MANUFACTURER;
/* 15 */            String str2 = Build.MODEL;
                }

                public final void I00Iooi00oi(int i, CharSequence charSequence) {
/* 1 */             II0lI0lO1 iI0lI0lO1 = this.I0110OiO;
/* 5 */             if (!iI0lI0lO1.I000iOII) {
/* 10 */                if (iI0lI0lO1.I000OiO) {
/* 21 */                    iI0lI0lO1.I000OiO = false;
/* 23 */                    Executor executorI0000oI00 = iI0lI0lO1.I0000oI00();
/* 29 */                    II0OlOll iI0OlOll = new II0OlOll(0);
/* 32 */                    iI0OlOll.I00iiO = this;
/* 34 */                    iI0OlOll.I00iiI = i;
/* 36 */                    iI0OlOll.I00iio = charSequence;
/* 38 */                    VarHandle.storeStoreFence();
/* 41 */                    executorI0000oI00.execute(iI0OlOll);
                        } else {
/* 16 */                    Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
                        }
                    }
/* 44 */            I00IoO0();
                }

                public final void I00O0i0ii(II0iil1 iI0iil1) {
/* 1 */             II0lI0lO1 iI0lI0lO1 = this.I0110OiO;
/* 5 */             if (iI0lI0lO1.I000OiO) {
/* 16 */                iI0lI0lO1.I000OiO = false;
/* 18 */                Executor executorI0000oI00 = iI0lI0lO1.I0000oI00();
/* 25 */                I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(5);
/* 28 */                i0iOo0oioiO.I00iiI = this;
/* 30 */                i0iOo0oioiO.I00iiO = iI0iil1;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                executorI0000oI00.execute(i0iOo0oioiO);
                    } else {
/* 11 */                Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
                    }
/* 38 */            I00IoO0();
                }
            }
