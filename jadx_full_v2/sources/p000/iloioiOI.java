            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            
/* 12 */    public final class iloioiOI extends i0IiIO {
                public final int I000O01llI0 = 0;
                public final Object I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iloioiOI(iloll1 iloll1Var, illIIi01 illiii01, IlloIo0O illoIo0O) {
/* 10 */            super("com.google.android.apps.aicore.aidl.ICortanaResultCallback", 10);
/* 4 */             this.I000OOo1O = illoIo0O;
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 5 */             int i3 = 0;
/* 7 */             Object obj = this.I000OOo1O;
/* 9 */             iIolOi01l0o iili1o1lii0 = null;
                    switch (i2) {
                        case 0:
/* 101 */                   IIiOOI iIiOOI = ((IlloIo0O) obj).I00iOIl;
/* 103 */                   if (i == 2) {
/* 132 */                       iII0OII iii0oii = (iII0OII) lO0Ooi.I00000oIO(parcel, iII0OII.CREATOR);
/* 134 */                       lO0Ooi.I00000oOI(parcel);
/* 137 */                       iiOi1illIO1o iioi1illio1o = iii0oii.I00iiI;
/* 139 */                       int i4 = iii0oii.I00iiO;
/* 143 */                       lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 145 */                       lOl10OOloi lol10ooloi = lOl10OOloi.I00ilI0I1;
/* 147 */                       illOiIiI0i1 illoiiii0i1 = new illOiIiI0i1();
/* 150 */                       if (lol10ooloi == null) {
/* 168 */                           IOOlIIilOl0.I000II("Null results");
/* 171 */                           throw null;
                                }
/* 152 */                       illoiiii0i1.I00000oIO = lol10ooloi;
/* 154 */                       illoiiii0i1.I00000oOI = iioi1illio1o;
/* 156 */                       illoiiii0i1.I0000Il00O = i4;
/* 158 */                       VarHandle.storeStoreFence();
/* 161 */                       iIiOOI.I00000oOI(illoiiii0i1);
                            } else {
/* 105 */                       if (i != 3) {
/* 5 */                             return false;
                                }
/* 108 */                       int i5 = parcel.readInt();
/* 112 */                       lO0Ooi.I00000oOI(parcel);
/* 121 */                       iIiOOI.I0000O(ilIoOl.I00000oOI(i5, null, "Inference failed."));
                            }
/* 6 */                     return true;
                        default:
/* 13 */                    l001Oo l001oo = (l001Oo) obj;
/* 15 */                    if (i == 2) {
/* 65 */                        IBinder strongBinder = parcel.readStrongBinder();
/* 69 */                        if (strongBinder != null) {
/* 74 */                            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 88 */                            iili1o1lii0 = iInterfaceQueryLocalInterface instanceof iIolOi01l0o ? (iIolOi01l0o) iInterfaceQueryLocalInterface : new iIlI1O1liI0(strongBinder);
                                }
/* 91 */                        lO0Ooi.I00000oOI(parcel);
/* 94 */                        l001oo.I0000oI00(iili1o1lii0);
                            } else {
/* 17 */                        if (i != 3) {
/* 5 */                             return false;
                                }
/* 20 */                        int i6 = parcel.readInt();
/* 24 */                        String string = parcel.readString();
/* 28 */                        lO0Ooi.I00000oOI(parcel);
/* 31 */                        if (i6 == 1) {
/* 44 */                            i3 = 601;
                                } else if (i6 == 2) {
/* 41 */                            i3 = GenAiException.ErrorCode.NEEDS_SYSTEM_UPDATE;
                                } else if (i6 == 3) {
/* 38 */                            i3 = 607;
                                }
/* 60 */                        l001oo.I0001Ioi1lo(ilIoOl.I0000O("AiCore service is not connected. Service provider failure: ".concat(String.valueOf(string)), null, i3));
                            }
/* 6 */                     return true;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public iloioiOI(l001Oo l001oo) {
/* 15 */            super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback", 10);
/* 14 */            this.I000OOo1O = l001oo;
                }
            }
