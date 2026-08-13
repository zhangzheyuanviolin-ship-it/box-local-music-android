            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.function.Consumer;
            import java.util.stream.Stream;
            
/* 11 */    public final class ii0o00I1l extends i0IiIO {
                public final int I000O01llI0 = 2;
                public final Object I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ii0o00I1l(Consumer consumer) {
/* 9 */             super("com.google.android.apps.aicore.aidl.IImageDescriptionStreamingCallback", 2);
/* 4 */             this.I000OOo1O = consumer;
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
                    ioIl00 ioil00;
/* 1 */             int i2 = this.I000O01llI0;
/* 4 */             l0o1looii0Ol ioloiioi = null;
/* 7 */             Object obj = this.I000OOo1O;
/* 9 */             int i3 = 0;
                    switch (i2) {
                        case 0:
/* 254 */                   if (i != 2) {
                                break;
                            } else {
/* 256 */                       String string = parcel.readString();
/* 260 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 265 */                       ((Consumer) obj).accept(string);
                                break;
                            }
                        case 1:
/* 131 */                   IIiOOI iIiOOI = (IIiOOI) ((i1Il01) obj).I00iiI;
/* 133 */                   if (i == 2) {
/* 158 */                       Parcelable.Creator<i1oloIIl> creator = i1oloIIl.CREATOR;
/* 160 */                       int i4 = iil1ii1loOI1.I00000oIO;
/* 169 */                       i1oloIIl i1oloiilCreateFromParcel = parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null;
/* 178 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 181 */                       ArrayList arrayList = i1oloiilCreateFromParcel.I00iiO;
/* 183 */                       if (arrayList != null) {
/* 196 */                           Stream map = arrayList.stream().map(new i0OIIoiOl1I(10));
/* 200 */                           ioI11OIOiiI ioi11oioiii = ioIl00.I00lll10;
/* 208 */                           ioil00 = (ioIl00) map.collect(iloiloiI0l.I00000oIO);
                                } else {
/* 211 */                           ioI11OIOiiI ioi11oioiii2 = ioIl00.I00lll10;
/* 213 */                           ioil00 = iooO1OIlo.I00o101lO;
                                }
/* 215 */                       ArrayList arrayList2 = i1oloiilCreateFromParcel.I00iOIl;
/* 217 */                       iII0O0OIo iii0o0oio = i1oloiilCreateFromParcel.I00iiI;
/* 221 */                       ii00IIO11 ii00iio11 = new ii00IIO11();
/* 224 */                       if (arrayList2 != null) {
/* 226 */                           ii00iio11.I00000oIO = arrayList2;
/* 228 */                           ii00iio11.I00000oOI = iii0o0oio;
/* 230 */                           if (ioil00 != null) {
/* 232 */                               ii00iio11.I0000Il00O = ioil00;
/* 234 */                               VarHandle.storeStoreFence();
/* 237 */                               iIiOOI.I00000oOI(ii00iio11);
                                        break;
                                    } else {
/* 243 */                               IOOlIIilOl0.I000II("Null scores");
                                    }
                                } else {
/* 249 */                           IOOlIIilOl0.I000II("Null descriptions");
                                }
                            } else if (i == 3) {
/* 140 */                       int i5 = parcel.readInt();
/* 144 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 154 */                       iIiOOI.I0000O(new iOIIOoOoii(2, i5, "Inference failed.", null));
                                break;
                            }
                            break;
                        case 2:
/* 98 */                    IIiOOI iIiOOI2 = (IIiOOI) obj;
/* 100 */                   if (i == 2) {
/* 123 */                       iIiOOI2.I00000oOI(null);
                                break;
                            } else if (i == 3) {
/* 106 */                       int i6 = parcel.readInt();
/* 110 */                       iil1ii1loOI1.I00000oIO(parcel);
/* 119 */                       iIiOOI2.I0000O(iOIIOoOoii.I0000Il00O(i6, null, "Preparation failed."));
                                break;
                            } else {
                                break;
                            }
                        default:
/* 13 */                    iiooi0i iiooi0iVar = (iiooi0i) obj;
/* 15 */                    if (i == 2) {
/* 65 */                        IBinder strongBinder = parcel.readStrongBinder();
/* 69 */                        if (strongBinder != null) {
/* 74 */                            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 88 */                            ioloiioi = iInterfaceQueryLocalInterface instanceof l0o1looii0Ol ? (l0o1looii0Ol) iInterfaceQueryLocalInterface : new iolOiIoi(strongBinder);
                                }
/* 91 */                        iil1ii1loOI1.I00000oIO(parcel);
/* 94 */                        iiooi0iVar.I000OiO(ioloiioi);
                                break;
                            } else if (i == 3) {
/* 21 */                        int i7 = parcel.readInt();
/* 25 */                        String string2 = parcel.readString();
/* 29 */                        iil1ii1loOI1.I00000oIO(parcel);
/* 32 */                        if (i7 == 1) {
/* 45 */                            i3 = 601;
                                } else if (i7 == 2) {
/* 42 */                            i3 = GenAiException.ErrorCode.NEEDS_SYSTEM_UPDATE;
                                } else if (i7 == 3) {
/* 39 */                            i3 = 607;
                                }
/* 61 */                        iiooi0iVar.I000iOII(iOIIOoOoii.I00000oIO("AiCore service is not connected. Service error: ".concat(String.valueOf(string2)), null, i3));
                                break;
                            } else {
                                break;
                            }
                    }
/* 6 */             return true;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public ii0o00I1l(IIiOOI iIiOOI) {
/* 14 */            super("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback", 2);
/* 13 */            this.I000OOo1O = iIiOOI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public ii0o00I1l(i1Il01 i1il01) {
/* 16 */            super("com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback", 2);
/* 15 */            this.I000OOo1O = i1il01;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public ii0o00I1l(iiooi0i iiooi0iVar) {
/* 18 */            super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback", 2);
/* 17 */            this.I000OOo1O = iiooi0iVar;
                }
            }
