            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.proofreading.zzk;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
/* 11 */    public final class iiOlIi0l00ll extends i0IiIO {
                public final int I000O01llI0 = 0;
                public final Object I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiOlIi0l00ll(IIiOOI iIiOOI) {
/* 9 */             super("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback", 3);
/* 4 */             this.I000OOo1O = iIiOOI;
                }

                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 4 */             l0IIolOoi0I io100oio = null;
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
/* 303 */                       iil0I01i.I00000oIO(parcel);
/* 312 */                       iIiOOI.I0000O(iOiI1oOo1l.I0000Il00O(i4, null, "Preparation failed."));
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
/* 281 */                           io100oio = iInterfaceQueryLocalInterface instanceof l0IIolOoi0I ? (l0IIolOoi0I) iInterfaceQueryLocalInterface : new io100oIo(strongBinder);
                                }
/* 284 */                       iil0I01i.I00000oIO(parcel);
/* 287 */                       iiooi0iVar.I000O01llI0(io100oio);
                                break;
                            } else if (i == 3) {
/* 214 */                       int i5 = parcel.readInt();
/* 218 */                       String string = parcel.readString();
/* 222 */                       iil0I01i.I00000oIO(parcel);
/* 225 */                       if (i5 == 1) {
/* 238 */                           i3 = 601;
                                } else if (i5 == 2) {
/* 235 */                           i3 = GenAiException.ErrorCode.NEEDS_SYSTEM_UPDATE;
                                } else if (i5 == 3) {
/* 232 */                           i3 = 607;
                                }
/* 254 */                       iiooi0iVar.I000l1(iOiI1oOo1l.I00000oIO("AiCore service is not connected. Service error: ".concat(String.valueOf(string)), null, i3));
                                break;
                            } else {
                                break;
                            }
                        case 2:
/* 173 */                   if (i != 2) {
                                break;
                            } else {
/* 175 */                       String string2 = parcel.readString();
/* 179 */                       iil0I01i.I00000oIO(parcel);
/* 182 */                       zzk zzkVar = (zzk) obj;
/* 195 */                       zzkVar.zza.compareAndSet(0L, SystemClock.elapsedRealtime() - zzkVar.zzb);
/* 200 */                       zzkVar.zzc.onNewText(string2);
                                break;
                            }
                        default:
/* 17 */                    IIiOOI iIiOOI2 = (IIiOOI) ((iii1IIii) obj).I00iiI;
/* 19 */                    if (i == 2) {
/* 45 */                        Parcelable.Creator<iII0OO1I1> creator = iII0OO1I1.CREATOR;
/* 47 */                        int i6 = iil0I01i.I00000oIO;
/* 56 */                        iII0OO1I1 iii0oo1i1CreateFromParcel = parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null;
/* 65 */                        iil0I01i.I00000oIO(parcel);
/* 68 */                        io00I0oIIIi io00i0oiiii = io0OIIlOli1.I00iiI;
/* 71 */                        Object[] objArrCopyOf = new Object[4];
/* 73 */                        io0OIIlOli1 io0oiiloli1 = iii0oo1i1CreateFromParcel.I00iOIl;
/* 75 */                        int size = io0oiiloli1.size();
/* 79 */                        int i7 = 0;
/* 80 */                        int i8 = 0;
                                while (true) {
/* 81 */                            if (i7 < size) {
/* 87 */                                iIOolIO1ooI iioolio1ooi = (iIOolIO1ooI) io0oiiloli1.get(i7);
/* 89 */                                String str = iioolio1ooi.I00iOIl;
/* 91 */                                int i9 = iioolio1ooi.I00iiI;
/* 93 */                                float f = iioolio1ooi.I00iio;
/* 97 */                                ilI1io11i1 ili1io11i1 = new ilI1io11i1();
/* 100 */                               if (str != null) {
/* 102 */                                   ili1io11i1.I00000oIO = str;
/* 104 */                                   ili1io11i1.I00000oOI = i9;
/* 106 */                                   ili1io11i1.I0000Il00O = f;
/* 108 */                                   VarHandle.storeStoreFence();
/* 111 */                                   int length = objArrCopyOf.length;
/* 112 */                                   int i10 = i8 + 1;
/* 114 */                                   int iI00000oIO = lioOIliIloli.I00000oIO(length, i10);
/* 118 */                                   if (iI00000oIO > length) {
/* 121 */                                       objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI00000oIO);
                                            }
/* 125 */                                   objArrCopyOf[i8] = ili1io11i1;
/* 127 */                                   i7++;
/* 129 */                                   i8 = i10;
                                        } else {
/* 133 */                                   IOOlIIilOl0.I000II("Null text");
                                        }
                                    } else {
/* 137 */                               io1O1ooo io1o1oooI000lI = io0OIIlOli1.I000lI(i8, objArrCopyOf);
/* 141 */                               i1ll1I1llOl0 i1ll1i1llol0 = iii0oo1i1CreateFromParcel.I00iiI;
/* 145 */                               io0OIIlOli1 io0oiiloli1I000o00OoI0I = io0OIIlOli1.I000o00OoI0I(io1o1oooI000lI);
/* 149 */                               il1lO1IO00I1 il1lo1io00i1 = new il1lO1IO00I1();
/* 152 */                               if (io0oiiloli1I000o00OoI0I != null) {
/* 154 */                                   il1lo1io00i1.I00000oIO = io0oiiloli1I000o00OoI0I;
/* 156 */                                   il1lo1io00i1.I00000oOI = i1ll1i1llol0;
/* 158 */                                   VarHandle.storeStoreFence();
/* 161 */                                   iIiOOI2.I00000oOI(il1lo1io00i1);
                                            break;
                                        } else {
/* 167 */                                   IOOlIIilOl0.I000II("Null results");
                                        }
                                    }
                                }
                            } else if (i == 3) {
/* 26 */                        int i11 = parcel.readInt();
/* 30 */                        iil0I01i.I00000oIO(parcel);
/* 40 */                        iIiOOI2.I0000O(new iOiI1oOo1l(2, i11, "Inference failed.", null));
                                break;
                            }
                            break;
                    }
/* 9 */             return false;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public iiOlIi0l00ll(zzk zzkVar) {
/* 14 */            super("com.google.android.apps.aicore.aidl.IMagicRewriteStreamingCallback", 3);
/* 13 */            this.I000OOo1O = zzkVar;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public iiOlIi0l00ll(iii1IIii iii1iiii) {
/* 16 */            super("com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback", 3);
/* 15 */            this.I000OOo1O = iii1iiii;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public iiOlIi0l00ll(iiooi0i iiooi0iVar) {
/* 18 */            super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback", 3);
/* 17 */            this.I000OOo1O = iiooi0iVar;
                }
            }
