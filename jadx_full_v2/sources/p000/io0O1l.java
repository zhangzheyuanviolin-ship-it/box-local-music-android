            package p000;

            import android.os.Parcel;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            
            public final class io0O1l extends i0IiIO {
                public final int I000O01llI0;
                public final IIiOOI I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public io0O1l(ioii01Ii100 ioii01ii100, IIiOOI iIiOOI, int i) {
/* 15 */            super("com.google.android.apps.aicore.aidl.ITokenizationCallback", 10);
/* 1 */             this.I000O01llI0 = i;
                    switch (i) {
                        case 1:
/* 19 */                    this.I000OOo1O = iIiOOI;
/* 23 */                    super("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback", 10);
                            break;
                        default:
/* 8 */                     this.I000OOo1O = iIiOOI;
/* 10 */                    Objects.requireNonNull(ioii01ii100);
                            break;
                    }
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 8 */             IIiOOI iIiOOI = this.I000OOo1O;
                    switch (i2) {
                        case 0:
/* 67 */                    if (i == 2) {
/* 158 */                       parcel.readInt();
/* 161 */                       lO0Ooi.I00000oOI(parcel);
/* 176 */                       iIiOOI.I0000O(new ilIoOl(5, 14, "GetTokenInfo should not invoke onTokenizationSuccess method.", null, null));
                                break;
                            } else if (i == 3) {
/* 137 */                       int i3 = parcel.readInt();
/* 141 */                       lO0Ooi.I00000oOI(parcel);
/* 154 */                       iIiOOI.I0000O(new ilIoOl(5, i3, "Tokenization failed.", null, null));
                                break;
                            } else if (i == 4) {
/* 116 */                       il0OIOlll il0oiolll = (il0OIOlll) lO0Ooi.I00000oIO(parcel, il0OIOlll.CREATOR);
/* 118 */                       lO0Ooi.I00000oOI(parcel);
/* 123 */                       int i4 = il0oiolll.I00iOIl;
/* 125 */                       ilOl1l ilol1l = new ilOl1l();
/* 128 */                       ilol1l.I00000oIO = i4;
/* 130 */                       VarHandle.storeStoreFence();
/* 133 */                       iIiOOI.I00000oOI(ilol1l);
                                break;
                            } else if (i == 5) {
/* 84 */                        ll0oil ll0oilVar = (ll0oil) lO0Ooi.I00000oIO(parcel, ll0oil.CREATOR);
/* 86 */                        lO0Ooi.I00000oOI(parcel);
/* 106 */                       iIiOOI.I0000O(new ilIoOl(5, ll0oilVar != null ? ll0oilVar.I00iiI : 0, "Tokenization failed.", null, null));
                                break;
                            } else {
                                break;
                            }
                        default:
/* 14 */                    if (i == 2) {
/* 63 */                        iIiOOI.I00000oOI(null);
                                break;
                            } else if (i == 3) {
/* 48 */                        int i5 = parcel.readInt();
/* 52 */                        lO0Ooi.I00000oOI(parcel);
/* 59 */                        iIiOOI.I0000O(ilIoOl.I0000Il00O(i5, null, "Preparation failed."));
                                break;
                            } else if (i == 4) {
/* 30 */                        ll0oil ll0oilVar2 = (ll0oil) lO0Ooi.I00000oIO(parcel, ll0oil.CREATOR);
/* 32 */                        lO0Ooi.I00000oOI(parcel);
/* 44 */                        iIiOOI.I0000O(ilIoOl.I0000Il00O(ll0oilVar2 != null ? ll0oilVar2.I00iiI : 0, null, "Preparation failed."));
                                break;
                            } else {
                                break;
                            }
                    }
/* 3 */             return true;
                }
            }
