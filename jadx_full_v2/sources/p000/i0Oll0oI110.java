            package p000;

            import android.accounts.Account;
            import android.content.Context;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import android.util.Log;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import java.lang.invoke.VarHandle;
            import java.util.Set;
            import org.json.JSONException;
            
            public final class i0Oll0oI110 extends i0IiIO implements Io0iOIIio, Io0iOll {
                public static final i0Oio1 I000oI1ioi = i0Olol1Iii.I00000oIO;
                public Context I000O01llI0;
                public O1oo1il01OoO I000OOo1O;
                public i0Oio1 I000OiO;
                public Set I000iOII;
                public I0Oi111ii I000l1;
                public Ol0II1lI0I I000lI;
                public OIoIIOIioo I000o00OoI0I;

                @Override
                public final void I00000oOI(IOlo10lO1iOl iOlo10lO1iOl) {
/* 3 */             this.I000o00OoI0I.I00000oIO(iOlo10lO1iOl);
                }

                @Override
                public final void I0000O(int i) {
/* 1 */             OIoIIOIioo oIoIIOIioo = this.I000o00OoI0I;
/* 17 */            i0Ol1Ool00 i0ol1ool00 = (i0Ol1Ool00) ((Io0iOoo) oIoIIOIioo.I00ilO0).I00l0OO0IO.get((I11Oil) oIoIIOIioo.I00iiO);
/* 19 */            if (i0ol1ool00 != null) {
/* 23 */                if (i0ol1ool00.I000oI1ioi) {
/* 33 */                    i0ol1ool00.I000o00OoI0I(new IOlo10lO1iOl(17, null, null));
                        } else {
/* 37 */                    i0ol1ool00.I0000O(i);
                        }
                    }
                }

                @Override
                public final void I0000oI00() throws NumberFormatException {
                    GoogleSignInAccount googleSignInAccountI00000oOI;
/* 1 */             Ol0II1lI0I ol0II1lI0I = this.I000lI;
/* 3 */             ol0II1lI0I.getClass();
                    try {
/* 12 */                ol0II1lI0I.I001lllioOl.getClass();
/* 19 */                Account account = new Account("<<default account>>", "com.google");
/* 28 */                if ("<<default account>>".equals(account.name)) {
/* 32 */                    OlOIIi0lO0 olOIIi0lO0I00000oIO = OlOIIi0lO0.I00000oIO(ol0II1lI0I.I0000Il00O);
/* 38 */                    String strI00000oOI = olOIIi0lO0I00000oIO.I00000oOI("defaultGoogleSignInAccount");
/* 46 */                    if (!TextUtils.isEmpty(strI00000oOI)) {
/* 62 */                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strI00000oOI).length());
/* 67 */                        sb.append("googleSignInAccount:");
/* 70 */                        sb.append(strI00000oOI);
/* 77 */                        String strI00000oOI2 = olOIIi0lO0I00000oIO.I00000oOI(sb.toString());
/* 81 */                        if (strI00000oOI2 != null) {
                                    try {
/* 83 */                                googleSignInAccountI00000oOI = GoogleSignInAccount.I00000oOI(strI00000oOI2);
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
/* 90 */                    googleSignInAccountI00000oOI = null;
                        } else {
/* 90 */                    googleSignInAccountI00000oOI = null;
                        }
/* 93 */                Integer num = ol0II1lI0I.I00II0Ol1O0l;
/* 95 */                lII0I0I000I.I000II(num);
/* 103 */               i0i0iI0O00 i0i0ii0o00 = new i0i0iI0O00(2, account, num.intValue(), googleSignInAccountI00000oOI);
/* 110 */               i0OoOilOo0 i0oooiloo0 = (i0OoOilOo0) ol0II1lI0I.I000l1();
/* 114 */               i0Ooili1oO1o i0ooili1oo1o = new i0Ooili1oO1o(1, i0i0ii0o00);
/* 117 */               Parcel parcelI0000oI00 = i0oooiloo0.I0000oI00();
/* 121 */               i0OlOO.I00000oOI(parcelI0000oI00, i0ooili1oo1o);
/* 124 */               parcelI0000oI00.writeStrongBinder(this);
/* 129 */               i0oooiloo0.I00IoIO0lI(12, parcelI0000oI00);
                    } catch (RemoteException e) {
/* 137 */               Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                        try {
/* 149 */                   i0i010Oli i0i010oli = new i0i010Oli(1, new IOlo10lO1iOl(8, null, null), null);
/* 155 */                   iooili01 iooili01Var = new iooili01(4);
/* 158 */                   iooili01Var.I00iiI = i0i010oli;
/* 160 */                   iooili01Var.I00iiO = this;
/* 162 */                   VarHandle.storeStoreFence();
/* 167 */                   this.I000OOo1O.post(iooili01Var);
                        } catch (RemoteException unused2) {
/* 173 */                   Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
                        }
                    }
                }

                @Override
                public final boolean I00IoO0(int i, Parcel parcel, Parcel parcel2) {
                    switch (i) {
                        case 3:
/* 108 */                   i0OlOO.I0000Il00O(parcel);
                            break;
                        case 4:
/* 88 */                    i0OlOO.I0000Il00O(parcel);
                            break;
                        case 5:
                        default:
/* 4 */                     return false;
                        case 6:
/* 76 */                    i0OlOO.I0000Il00O(parcel);
                            break;
                        case 7:
/* 64 */                    i0OlOO.I0000Il00O(parcel);
                            break;
                        case 8:
/* 24 */                    i0i010Oli i0i010oli = (i0i010Oli) i0OlOO.I00000oIO(parcel, i0i010Oli.CREATOR);
/* 26 */                    i0OlOO.I0000Il00O(parcel);
/* 32 */                    iooili01 iooili01Var = new iooili01(4);
/* 35 */                    iooili01Var.I00iiI = i0i010oli;
/* 37 */                    iooili01Var.I00iiO = this;
/* 39 */                    VarHandle.storeStoreFence();
/* 44 */                    this.I000OOo1O.post(iooili01Var);
                            break;
                        case 9:
/* 14 */                    i0OlOO.I0000Il00O(parcel);
                            break;
                    }
/* 111 */           parcel2.writeNoException();
/* 114 */           return true;
                }
            }
