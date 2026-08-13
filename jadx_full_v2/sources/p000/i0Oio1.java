            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.Looper;
            import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
            import java.lang.invoke.VarHandle;
            
            public final class i0Oio1 {
                public final int I00000oIO;

                public i0Oio1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public Io0OoIoOo I00000oIO(Context context, Looper looper, I0Oi111ii i0Oi111ii, Object obj, Io0iOIIio io0iOIIio, Io0iOll io0iOll) {
/* 1 */             int i = this.I00000oIO;
                    switch (i) {
                        case 0:
/* 120 */                   Object obj2 = i0Oi111ii.I00ilO0;
/* 124 */                   Integer num = (Integer) i0Oi111ii.I00io1l;
/* 128 */                   Bundle bundle = new Bundle();
/* 134 */                   bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
/* 137 */                   if (num != null) {
/* 145 */                       bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                            }
/* 151 */                   bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
/* 156 */                   bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
/* 161 */                   bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
/* 167 */                   bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
/* 172 */                   bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
/* 177 */                   bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
/* 182 */                   bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
/* 187 */                   bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
/* 195 */                   Ol0II1lI0I ol0II1lI0I = new Ol0II1lI0I(context, looper, 44, i0Oi111ii, io0iOIIio, io0iOll);
/* 198 */                   ol0II1lI0I.I001lIiIIo1O = true;
/* 200 */                   ol0II1lI0I.I001lllioOl = i0Oi111ii;
/* 202 */                   ol0II1lI0I.I001lloI = bundle;
/* 208 */                   ol0II1lI0I.I00II0Ol1O0l = (Integer) i0Oi111ii.I00io1l;
/* 210 */                   VarHandle.storeStoreFence();
/* 213 */                   return ol0II1lI0I;
                        case 1:
/* 112 */                   throw IIlIOloOOO.I000l1(obj);
                        case 5:
/* 104 */                   return new lIOlIOO0l(context, looper, ModuleDescriptor.MODULE_VERSION, i0Oi111ii, io0iOIIio, io0iOll);
                        case 7:
/* 90 */                    return new lIIo1l(context, looper, 51, i0Oi111ii, io0iOIIio, io0iOll);
                        default:
/* 7 */                     i0Ol1Ool00 i0ol1ool00 = (i0Ol1Ool00) io0iOIIio;
/* 10 */                    i0Ol1Ool00 i0ol1ool002 = (i0Ol1Ool00) io0iOll;
                            switch (i) {
                                case 2:
/* 76 */                            return new i0i0iOi(context, looper, 308, i0Oi111ii, i0ol1ool00, i0ol1ool002);
                                case 3:
/* 63 */                            return new i0OiooiiolO(context, looper, 449, i0Oi111ii, i0ol1ool00, i0ol1ool002);
                                case 4:
/* 45 */                            i0i01O0O11O i0i01o0o11o = new i0i01O0O11O(context, looper, 270, i0Oi111ii, i0ol1ool00, i0ol1ool002);
/* 48 */                            i0i01o0o11o.I001lIiIIo1O = (OloOII1ioI1l) obj;
/* 50 */                            VarHandle.storeStoreFence();
/* 79 */                            return i0i01o0o11o;
                                case 5:
                                default:
/* 22 */                            throw new UnsupportedOperationException("buildClient must be implemented");
                                case 6:
/* 32 */                            return new il1I0l(context, looper, 457, i0Oi111ii, i0ol1ool00, i0ol1ool002);
                            }
                    }
                }
            }
