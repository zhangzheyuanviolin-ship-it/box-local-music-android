            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.rewriting.zzg;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
/* 11 */    public final class iiOli1O extends i0IiIO {
                public final int I000O01llI0 = 0;
                public final Object I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiOli1O(IIiOOI iIiOOI) {
/* 9 */             super("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback", 4);
/* 4 */             this.I000OOo1O = iIiOOI;
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 4 */             l0IO0lo0ool io1011liiVar = null;
/* 6 */             Object obj = this.I000OOo1O;
/* 9 */             int i3 = 0;
                    switch (i2) {
                        case 0:
/* 291 */                   IIiOOI iIiOOI = (IIiOOI) obj;
/* 293 */                   if (i == 2) {
/* 316 */                       iIiOOI.I00000oOI(null);
                                break;
                            } else if (i == 3) {
/* 299 */                       int i4 = parcel.readInt();
/* 303 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 312 */                       iIiOOI.I0000O(iOiIOO1ll.I0000Il00O(i4, null, "Preparation failed."));
                                break;
                            } else {
                                break;
                            }
                        case 1:
/* 206 */                   iiooi0i iiooi0iVar = (iiooi0i) obj;
/* 208 */                   if (i == 2) {
/* 258 */                       IBinder strongBinder = parcel.readStrongBinder();
/* 262 */                       if (strongBinder != null) {
/* 267 */                           IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 281 */                           io1011liiVar = iInterfaceQueryLocalInterface instanceof l0IO0lo0ool ? (l0IO0lo0ool) iInterfaceQueryLocalInterface : new io1011lii(strongBinder);
                                }
/* 284 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 287 */                       iiooi0iVar.I000OOo1O(io1011liiVar);
                                break;
                            } else if (i == 3) {
/* 214 */                       int i5 = parcel.readInt();
/* 218 */                       String string = parcel.readString();
/* 222 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 225 */                       if (i5 == 1) {
/* 238 */                           i3 = 601;
                                } else if (i5 == 2) {
/* 235 */                           i3 = GenAiException.ErrorCode.NEEDS_SYSTEM_UPDATE;
                                } else if (i5 == 3) {
/* 232 */                           i3 = 607;
                                }
/* 254 */                       iiooi0iVar.I000lI(iOiIOO1ll.I00000oIO("AiCore service is not connected. Service error: ".concat(String.valueOf(string)), null, i3));
                                break;
                            } else {
                                break;
                            }
                        case 2:
/* 173 */                   if (i != 2) {
                                break;
                            } else {
/* 175 */                       String string2 = parcel.readString();
/* 179 */                       iil0IIlIl0oo.I00000oIO(parcel);
/* 182 */                       zzg zzgVar = (zzg) obj;
/* 195 */                       zzgVar.zza.compareAndSet(0L, SystemClock.elapsedRealtime() - zzgVar.zzb);
/* 200 */                       zzgVar.zzc.onNewText(string2);
                                break;
                            }
                        default:
/* 17 */                    IIiOOI iIiOOI2 = (IIiOOI) ((i0OI1l1Oo) obj).I00iOIl;
/* 19 */                    if (i == 2) {
/* 45 */                        Parcelable.Creator<iII0lllIOl1I> creator = iII0lllIOl1I.CREATOR;
/* 47 */                        int i6 = iil0IIlIl0oo.I00000oIO;
/* 56 */                        iII0lllIOl1I iii0llliol1iCreateFromParcel = parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null;
/* 65 */                        iil0IIlIl0oo.I00000oIO(parcel);
/* 68 */                        io00III0o0i io00iii0o0i = io0OO101I.I00iiI;
/* 71 */                        Object[] objArrCopyOf = new Object[4];
/* 73 */                        io0OO101I io0oo101i = iii0llliol1iCreateFromParcel.I00iOIl;
/* 75 */                        int size = io0oo101i.size();
/* 79 */                        int i7 = 0;
/* 80 */                        int i8 = 0;
                                while (true) {
/* 81 */                            if (i7 < size) {
/* 87 */                                iIOolo1l iioolo1l = (iIOolo1l) io0oo101i.get(i7);
/* 89 */                                String str = iioolo1l.I00iOIl;
/* 91 */                                int i9 = iioolo1l.I00iiI;
/* 93 */                                float f = iioolo1l.I00iio;
/* 97 */                                ilI1loO01olI ili1loo01oli = new ilI1loO01olI();
/* 100 */                               if (str != null) {
/* 102 */                                   ili1loo01oli.I00000oIO = str;
/* 104 */                                   ili1loo01oli.I00000oOI = i9;
/* 106 */                                   ili1loo01oli.I0000Il00O = f;
/* 108 */                                   VarHandle.storeStoreFence();
/* 111 */                                   int length = objArrCopyOf.length;
/* 112 */                                   int i10 = i8 + 1;
/* 114 */                                   int iI00000oIO = lioOO0I.I00000oIO(length, i10);
/* 118 */                                   if (iI00000oIO > length) {
/* 121 */                                       objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI00000oIO);
                                            }
/* 125 */                                   objArrCopyOf[i8] = ili1loo01oli;
/* 127 */                                   i7++;
/* 129 */                                   i8 = i10;
                                        } else {
/* 133 */                                   IOOlIIilOl0.I000II("Null text");
                                        }
                                    } else {
/* 137 */                               io1OIiI1olo io1oiii1oloI000lI = io0OO101I.I000lI(i8, objArrCopyOf);
/* 141 */                               i1llOOiillll i1llooiillll = iii0llliol1iCreateFromParcel.I00iiI;
/* 145 */                               io0OO101I io0oo101iI000o00OoI0I = io0OO101I.I000o00OoI0I(io1oiii1oloI000lI);
/* 149 */                               il1li0 il1li0Var = new il1li0();
/* 152 */                               if (io0oo101iI000o00OoI0I != null) {
/* 154 */                                   il1li0Var.I00000oIO = io0oo101iI000o00OoI0I;
/* 156 */                                   il1li0Var.I00000oOI = i1llooiillll;
/* 158 */                                   VarHandle.storeStoreFence();
/* 161 */                                   iIiOOI2.I00000oOI(il1li0Var);
                                            break;
                                        } else {
/* 167 */                                   IOOlIIilOl0.I000II("Null results");
                                        }
                                    }
                                }
                            } else if (i == 3) {
/* 26 */                        int i11 = parcel.readInt();
/* 30 */                        iil0IIlIl0oo.I00000oIO(parcel);
/* 40 */                        iIiOOI2.I0000O(new iOiIOO1ll(2, i11, "Inference failed.", null));
                                break;
                            }
                            break;
                    }
/* 9 */             return false;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public iiOli1O(zzg zzgVar) {
/* 14 */            super("com.google.android.apps.aicore.aidl.IMagicRewriteStreamingCallback", 4);
/* 13 */            this.I000OOo1O = zzgVar;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public iiOli1O(i0OI1l1Oo i0oi1l1oo) {
/* 16 */            super("com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback", 4);
/* 15 */            this.I000OOo1O = i0oi1l1oo;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public iiOli1O(iiooi0i iiooi0iVar) {
/* 18 */            super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback", 4);
/* 17 */            this.I000OOo1O = iiooi0iVar;
                }
            }
