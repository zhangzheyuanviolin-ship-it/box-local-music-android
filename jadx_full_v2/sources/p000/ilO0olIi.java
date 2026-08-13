            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Log;
            import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
            
/* 17 */    public final class ilO0olIi extends iloOo1lIio {
                public final int I00ilI0I1;
                public final Object I00ilO0;
                public final Object I00io1l;
                public final Object I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ilO0olIi(IlIII0O1il ilIII0O1il, Activity activity, iioi1o1OO iioi1o1oo) {
/* 15 */            super((io0oIOI1o1i) ilIII0O1il.I00iiI, true);
/* 2 */             this.I00ilI0I1 = 3;
/* 4 */             this.I00io1l = activity;
/* 6 */             this.I00ioIO = iioi1o1oo;
/* 8 */             this.I00ilO0 = ilIII0O1il;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void I00000oIO() {
                    Boolean boolValueOf;
/* 5 */             Bundle bundle = null;
/* 5 */             il000illiO il000illioAsInterface = null;
                    switch (this.I00ilI0I1) {
                        case 0:
                            try {
/* 125 */                       Context context = (Context) this.I00io1l;
/* 127 */                       lII0I0I000I.I000II(context);
/* 130 */                       String strI00000oIO = ll011I.I00000oIO(context);
/* 134 */                       Resources resources = context.getResources();
/* 142 */                       if (TextUtils.isEmpty(strI00000oIO)) {
/* 144 */                           strI00000oIO = ll011I.I00000oIO(context);
                                }
/* 156 */                       int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strI00000oIO);
/* 160 */                       if (identifier == 0) {
/* 162 */                           boolValueOf = null;
                                } else {
                                    try {
/* 168 */                               boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                                    } catch (Resources.NotFoundException unused) {
                                    }
                                }
/* 176 */                       io0oIOI1o1i io0oioi1o1i = (io0oIOI1o1i) this.I00ilO0;
                                try {
/* 210 */                           il000illioAsInterface = iiollloIii1.asInterface(IioIii0IO.I0000Il00O(context, (boolValueOf == null || !boolValueOf.booleanValue()) != false ? IioIii0IO.I0000O : IioIii0IO.I0000Il00O, ModuleDescriptor.MODULE_ID).I00000oOI("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                                } catch (IioI1I1llol1 e) {
/* 215 */                           io0oioi1o1i.I00000oOI(e, true, false);
                                }
/* 218 */                       io0oioi1o1i.I0000oI00 = il000illioAsInterface;
/* 222 */                       if (io0oioi1o1i.I0000oI00 != null) {
/* 233 */                           int iI00000oIO = IioIii0IO.I00000oIO(context, ModuleDescriptor.MODULE_ID);
/* 237 */                           int iI0000O = IioIii0IO.I0000O(context, ModuleDescriptor.MODULE_ID, false);
/* 241 */                           int iMax = Math.max(iI00000oIO, iI0000O);
/* 257 */                           boolean z = Boolean.TRUE.equals(boolValueOf) || iI0000O < iI00000oIO;
                                    long j = iMax;
/* 259 */                           io0oioi1o1i.I0001Ioi1lo = j;
/* 277 */                           il1i11oOloil il1i11ooloil = new il1i11oOloil(161000L, j, z, (Bundle) this.I00ioIO, ll011I.I00000oIO(context));
/* 290 */                           Object[] objArr = io0oioi1o1i.I0001Ioi1lo >= 169;
/* 291 */                           il000illiO il000illio = io0oioi1o1i.I0000oI00;
/* 293 */                           if (objArr != true) {
/* 316 */                               lII0I0I000I.I000II(il000illio);
/* 325 */                               il000illio.initialize(OIOiOlIO01.I00O10llo(context), il1i11ooloil, this.I00iOIl);
                                        break;
                                    } else {
/* 295 */                               lII0I0I000I.I000II(il000illio);
/* 310 */                               il000illio.initializeWithElapsedTime(OIOiOlIO01.I00O10llo(context), il1i11ooloil, this.I00iOIl, this.I00iiI);
                                        break;
                                    }
                                } else {
/* 228 */                           Log.w("FA", "Failed to connect to measurement client.");
                                    break;
                                }
                            } catch (Exception e2) {
/* 333 */                       ((io0oIOI1o1i) this.I00ilO0).I00000oOI(e2, true, false);
/* 336 */                       return;
                            }
                            break;
                        case 1:
/* 103 */                   il000illiO il000illio2 = ((io0oIOI1o1i) this.I00ilO0).I0000oI00;
/* 105 */                   lII0I0I000I.I000II(il000illio2);
/* 116 */                   il000illio2.getMaxUserProperties((String) this.I00io1l, (iioi1o1OO) this.I00ioIO);
                            break;
                        case 2:
/* 42 */                    Bundle bundle2 = (Bundle) this.I00ioIO;
/* 44 */                    if (bundle2 != null) {
/* 48 */                        bundle = new Bundle();
/* 57 */                        if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
/* 59 */                            Object obj = bundle2.get("com.google.app_measurement.screen_service");
/* 65 */                            if (obj instanceof Bundle) {
/* 69 */                                bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                                    }
                                }
                            }
/* 80 */                    il000illiO il000illio3 = ((io0oIOI1o1i) ((IlIII0O1il) this.I00ilO0).I00iiI).I0000oI00;
/* 82 */                    lII0I0I000I.I000II(il000illio3);
/* 95 */                    il000illio3.onActivityCreatedByScionActivityInfo(il1l0io1O.I00000oOI((Activity) this.I00io1l), bundle, this.I00iiI);
                            break;
                        default:
/* 17 */                    il000illiO il000illio4 = ((io0oIOI1o1i) ((IlIII0O1il) this.I00ilO0).I00iiI).I0000oI00;
/* 19 */                    lII0I0I000I.I000II(il000illio4);
/* 36 */                    il000illio4.onActivitySaveInstanceStateByScionActivityInfo(il1l0io1O.I00000oOI((Activity) this.I00io1l), (iioi1o1OO) this.I00ioIO, this.I00iiI);
                            break;
                    }
                }

                @Override
                public void I00000oOI() {
                    switch (this.I00ilI0I1) {
                        case 1:
/* 12 */                    ((iioi1o1OO) this.I00ioIO).I001i1lo1io(null);
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public ilO0olIi(io0oIOI1o1i io0oioi1o1i, Object obj, Object obj2, int i) {
                    super(io0oioi1o1i, true);
/* 19 */            this.I00ilI0I1 = i;
                    this.I00io1l = obj;
                    this.I00ioIO = obj2;
                    this.I00ilO0 = io0oioi1o1i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 19 */        public ilO0olIi(IlIII0O1il ilIII0O1il, Bundle bundle, Activity activity) {
/* 21 */            super((io0oIOI1o1i) ilIII0O1il.I00iiI, true);
                    this.I00ilI0I1 = 2;
/* 20 */            this.I00ioIO = bundle;
                    this.I00io1l = activity;
                    this.I00ilO0 = ilIII0O1il;
                }
            }
