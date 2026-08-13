            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.mlkit.genai.common.GenAiException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Comparator;
            
/* 11 */    public final class iiOIOI extends i0IiIO {
                public final int I000O01llI0 = 0;
                public final Object I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iiOIOI(IIiOOI iIiOOI) {
/* 9 */             super("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback", 5);
/* 4 */             this.I000OOo1O = iIiOOI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
/* 1 */             int i2 = this.I000O01llI0;
/* 5 */             Object obj = this.I000OOo1O;
/* 8 */             l0IIO1Oi0lOi io101o1il = null;
/* 9 */             int i3 = 0;
                    switch (i2) {
                        case 0:
/* 321 */                   IIiOOI iIiOOI = (IIiOOI) obj;
/* 323 */                   if (i == 2) {
/* 346 */                       iIiOOI.I00000oOI(null);
/* 7 */                         return true;
                            }
/* 325 */                   if (i != 3) {
/* 9 */                         return false;
                            }
/* 329 */                   int i4 = parcel.readInt();
/* 333 */                   iil0Ii00oOI1.I00000oIO(parcel);
/* 342 */                   iIiOOI.I0000O(iOlI0O0iIiO.I0000Il00O(i4, null, "Preparation failed."));
/* 7 */                     return true;
                        case 1:
/* 236 */                   iiooi0i iiooi0iVar = (iiooi0i) obj;
/* 238 */                   if (i == 2) {
/* 288 */                       IBinder strongBinder = parcel.readStrongBinder();
/* 292 */                       if (strongBinder != null) {
/* 297 */                           IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
/* 311 */                           io101o1il = iInterfaceQueryLocalInterface instanceof l0IIO1Oi0lOi ? (l0IIO1Oi0lOi) iInterfaceQueryLocalInterface : new io101O1Il(strongBinder);
                                }
/* 314 */                       iil0Ii00oOI1.I00000oIO(parcel);
/* 317 */                       iiooi0iVar.I000II(io101o1il);
/* 7 */                         return true;
                            }
/* 240 */                   if (i != 3) {
/* 9 */                         return false;
                            }
/* 244 */                   int i5 = parcel.readInt();
/* 248 */                   String string = parcel.readString();
/* 252 */                   iil0Ii00oOI1.I00000oIO(parcel);
/* 255 */                   if (i5 == 1) {
/* 268 */                       i3 = 601;
                            } else if (i5 == 2) {
/* 265 */                       i3 = GenAiException.ErrorCode.NEEDS_SYSTEM_UPDATE;
                            } else if (i5 == 3) {
/* 262 */                       i3 = 607;
                            }
/* 284 */                   iiooi0iVar.I000o00OoI0I(iOlI0O0iIiO.I00000oIO("AiCore service is not connected. Service error: ".concat(String.valueOf(string)), null, i3));
/* 7 */                     return true;
                        default:
/* 17 */                    IIiOOI iIiOOI2 = (IIiOOI) ((i11I1Ili) obj).I00iiI;
/* 19 */                    if (i == 2) {
/* 45 */                        Parcelable.Creator<iO0i0o1l1Ii> creator = iO0i0o1l1Ii.CREATOR;
/* 47 */                        int i6 = iil0Ii00oOI1.I00000oIO;
/* 56 */                        iO0i0o1l1Ii io0i0o1l1iiCreateFromParcel = parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null;
/* 65 */                        iil0Ii00oOI1.I00000oIO(parcel);
/* 68 */                        io0iIOO0 io0iioo0 = io0o00I1ol1o.I00iiI;
/* 71 */                        Object[] objArrCopyOf = new Object[4];
/* 73 */                        io0o00I1ol1o io0o00i1ol1o = io0i0o1l1iiCreateFromParcel.I00iOIl;
/* 75 */                        int size = io0o00i1ol1o.size();
/* 79 */                        int i7 = 0;
/* 80 */                        int i8 = 0;
                                while (true) {
/* 81 */                            if (i7 < size) {
/* 87 */                                iI1IIiI1oo1 ii1iiii1oo1 = (iI1IIiI1oo1) io0o00i1ol1o.get(i7);
/* 89 */                                String str = ii1iiii1oo1.I00iOIl;
/* 91 */                                float f = ii1iiii1oo1.I00iio;
/* 95 */                                ilI1o0o1o ili1o0o1o = new ilI1o0o1o();
/* 98 */                                if (str != null) {
/* 100 */                                   ili1o0o1o.I00000oIO = str;
/* 102 */                                   ili1o0o1o.I00000oOI = f;
/* 104 */                                   VarHandle.storeStoreFence();
/* 107 */                                   int length = objArrCopyOf.length;
/* 108 */                                   int i9 = i8 + 1;
/* 110 */                                   int iI00000oIO = lioOolIil.I00000oIO(length, i9);
/* 114 */                                   if (iI00000oIO > length) {
/* 117 */                                       objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI00000oIO);
                                            }
/* 121 */                                   objArrCopyOf[i8] = ili1o0o1o;
/* 123 */                                   i7++;
/* 125 */                                   i8 = i9;
                                        } else {
/* 129 */                                   IOOlIIilOl0.I000II("Null text");
                                        }
                                    } else {
/* 144 */                               Comparator comparatorReversed = Comparator.comparing(new i0OIIoiOl1I(12)).reversed();
/* 148 */                               ioI01O0 ioi01o0I000lI = io0o00I1ol1o.I000lI(i8, objArrCopyOf);
/* 152 */                               comparatorReversed.getClass();
/* 155 */                               if (ioi01o0I000lI == null) {
/* 158 */                                   io0iIOO0 io0iioo0ListIterator = ioi01o0I000lI.listIterator(0);
/* 164 */                                   ArrayList arrayList = new ArrayList();
/* 167 */                                   io0iioo0ListIterator.getClass();
/* 174 */                                   while (io0iioo0ListIterator.hasNext()) {
/* 180 */                                       arrayList.add(io0iioo0ListIterator.next());
                                            }
/* 184 */                                   ioi01o0I000lI = arrayList;
                                        }
/* 185 */                               Object[] array = ioi01o0I000lI.toArray();
/* 189 */                               int length2 = array.length;
/* 190 */                               lioi0olooo.I00000oIO(length2, array);
/* 193 */                               Arrays.sort(array, comparatorReversed);
/* 196 */                               ioI01O0 ioi01o0I000lI2 = io0o00I1ol1o.I000lI(length2, array);
/* 200 */                               float f2 = io0i0o1l1iiCreateFromParcel.I00iiO;
/* 202 */                               i1oloIlo0o1o i1oloilo0o1o = io0i0o1l1iiCreateFromParcel.I00iiI;
/* 206 */                               io0o00I1ol1o io0o00i1ol1oI000o00OoI0I = io0o00I1ol1o.I000o00OoI0I(ioi01o0I000lI2);
/* 210 */                               il1liI1l00O il1lii1l00o = new il1liI1l00O();
/* 213 */                               if (io0o00i1ol1oI000o00OoI0I != null) {
/* 215 */                                   il1lii1l00o.I00000oIO = io0o00i1ol1oI000o00OoI0I;
/* 217 */                                   il1lii1l00o.I00000oOI = f2;
/* 219 */                                   il1lii1l00o.I0000Il00O = i1oloilo0o1o;
/* 221 */                                   VarHandle.storeStoreFence();
/* 224 */                                   iIiOOI2.I00000oOI(il1lii1l00o);
/* 7 */                                     return true;
                                        }
/* 230 */                               IOOlIIilOl0.I000II("Null summaries");
                                    }
                                }
                            } else if (i == 3) {
/* 26 */                        int i10 = parcel.readInt();
/* 30 */                        iil0Ii00oOI1.I00000oIO(parcel);
/* 40 */                        iIiOOI2.I0000O(new iOlI0O0iIiO(2, i10, "Inference failed.", null));
/* 7 */                         return true;
                            }
/* 9 */                     return false;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public iiOIOI(i11I1Ili i11i1ili) {
/* 14 */            super("com.google.android.apps.aicore.aidl.ISummarizationResultCallback", 5);
/* 13 */            this.I000OOo1O = i11i1ili;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public iiOIOI(iiooi0i iiooi0iVar) {
/* 16 */            super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback", 5);
/* 15 */            this.I000OOo1O = iiooi0iVar;
                }
            }
