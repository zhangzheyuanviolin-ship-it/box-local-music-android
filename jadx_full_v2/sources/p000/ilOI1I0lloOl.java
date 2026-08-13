            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.summarization.zzg;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Optional;
            import java.util.concurrent.Executor;
            
            public final class ilOI1I0lloOl {
                public static final int I000OiO = 0;
                public iOIIl1Oo I00000oIO;
                public iOli1OIoI0o I00000oOI;
                public i1O01oOIoI0I I0000Il00O;
                public l01oII I0000O;
                public Executor I0000oI00;
                public Object I0001Ioi1lo;
                public l0Io11IiO0l I000II;
                public ioo10O I000O01llI0;
                public Optional I000OOo1O;

                public final liiiOl01O I00000oIO(o0oIIOoI11O1 o0oiiooi11o1, iiOIOI iioioi) {
/* 6 */             Parcel parcelI00O0i0ii = o0oiiooi11o1.I00O0i0ii(4, o0oiiooi11o1.I00Iooi00oi());
/* 10 */            int i = parcelI00O0i0ii.readInt();
/* 14 */            parcelI00O0i0ii.recycle();
/* 18 */            liiiOl01O loiii0l0lii0 = null;
/* 21 */            if (i <= 0) {
/* 27 */                Log.w("ilOI1I0lloOl", "Ignoring prepareInferenceEngine because service is older than V2");
/* 41 */                ((IIiOOI) iioioi.I000OOo1O).I0000O(iOlI0O0iIiO.I0000Il00O(3, null, "Preparation failed."));
/* 46 */                return new il0o1oO0I("com.google.android.apps.aicore.aidl.ICancellationCallback", 5);
                    }
/* 50 */            Parcel parcelI00Iooi00oi = o0oiiooi11o1.I00Iooi00oi();
/* 54 */            int i2 = iil0Ii00oOI1.I00000oIO;
/* 56 */            parcelI00Iooi00oi.writeStrongBinder(iioioi);
/* 59 */            Parcel parcelI00O0i0ii2 = o0oiiooi11o1.I00O0i0ii(5, parcelI00Iooi00oi);
/* 63 */            IBinder strongBinder = parcelI00O0i0ii2.readStrongBinder();
/* 67 */            if (strongBinder != null) {
/* 70 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 84 */                loiii0l0lii0 = iInterfaceQueryLocalInterface instanceof liiiOl01O ? (liiiOl01O) iInterfaceQueryLocalInterface : new lOiIi0l0lII0(strongBinder);
                    }
/* 87 */            parcelI00O0i0ii2.recycle();
/* 106 */           return loiii0l0lii0;
                }

                public final liiiOl01O I00000oOI(o0oIIOoI11O1 o0oiiooi11o1, il1l01I0il il1l01i0il, i11I1Ili i11i1ili) {
/* 1 */             zzg zzgVar = il1l01i0il.I0000oI00;
/* 3 */             liiiOl01O loiii0l0lii0 = null;
/* 12 */            ilIOiI1 ilioii1 = zzgVar != null ? new ilIOiI1(zzgVar) : null;
/* 13 */            io0iIOO0 io0iioo0 = io0o00I1ol1o.I00iiI;
/* 16 */            Object[] objArrCopyOf = new Object[4];
/* 18 */            io0o00I1ol1o io0o00i1ol1o = il1l01i0il.I00000oIO;
/* 20 */            int size = io0o00i1ol1o.size();
/* 25 */            int i = 0;
/* 26 */            int i2 = 0;
/* 27 */            while (i < size) {
/* 39 */                iIiiii0loOl0 iiiiii0lool0 = new iIiiii0loOl0(((il1O0lOli0iO) io0o00i1ol1o.get(i)).I00000oIO);
/* 42 */                int length = objArrCopyOf.length;
/* 43 */                int i3 = i2 + 1;
/* 45 */                int iI00000oIO = lioOolIil.I00000oIO(length, i3);
/* 49 */                if (iI00000oIO > length) {
/* 52 */                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI00000oIO);
                        }
/* 56 */                objArrCopyOf[i2] = iiiiii0lool0;
/* 58 */                i++;
/* 60 */                i2 = i3;
                    }
/* 64 */            OOoli1l oOoli1l = il1l01i0il.I0000Il00O.I00000oIO;
/* 72 */            ArrayList arrayList = new ArrayList(oOoli1l.keySet());
/* 77 */            ArrayList arrayList2 = new ArrayList();
/* 80 */            int size2 = arrayList.size();
/* 85 */            for (int i4 = 0; i4 < size2; i4++) {
/* 93 */                Object obj = oOoli1l.get((String) arrayList.get(i4));
/* 97 */                if (obj == null) {
/* 100 */                   obj = "";
                        }
/* 104 */               arrayList2.add((String) obj);
                    }
/* 112 */           iIIoIliI0I11 iiioilii0i11 = new iIIoIliI0I11(arrayList, arrayList2);
/* 115 */           ioI01O0 ioi01o0I000lI = io0o00I1ol1o.I000lI(i2, objArrCopyOf);
/* 119 */           int i5 = il1l01i0il.I00000oOI;
/* 121 */           int i6 = il1l01i0il.I0000O;
/* 125 */           io0o00I1ol1o io0o00i1ol1oI000o00OoI0I = io0o00I1ol1o.I000o00OoI0I(ioi01o0I000lI);
/* 129 */           iIo000iolIl iio000iolil = new iIo000iolIl();
/* 132 */           iio000iolil.I00iOIl = io0o00i1ol1oI000o00OoI0I;
/* 135 */           iio000iolil.I00iiI = 0.0f;
/* 139 */           iio000iolil.I00iiO = 40;
/* 142 */           iio000iolil.I00iio = 3;
/* 146 */           iio000iolil.I00ilI0I1 = Barcode.FORMAT_QR_CODE;
/* 148 */           iio000iolil.I00ilO0 = ilioii1;
/* 151 */           iio000iolil.I00io1l = 1;
/* 153 */           iio000iolil.I00ioIO = i5;
/* 155 */           iio000iolil.I00ll1 = null;
/* 159 */           iio000iolil.I00l0I0l0lO1 = 123;
/* 161 */           iio000iolil.I00l0OO0IO = iiioilii0i11;
/* 163 */           iio000iolil.I00li1OI = i6;
/* 165 */           VarHandle.storeStoreFence();
/* 170 */           iiOIOI iioioi = new iiOIOI(i11i1ili);
/* 173 */           Parcel parcelI00Iooi00oi = o0oiiooi11o1.I00Iooi00oi();
/* 177 */           int i7 = iil0Ii00oOI1.I00000oIO;
/* 179 */           parcelI00Iooi00oi.writeInt(1);
/* 182 */           iio000iolil.writeToParcel(parcelI00Iooi00oi, 0);
/* 185 */           parcelI00Iooi00oi.writeStrongBinder(iioioi);
/* 188 */           Parcel parcelI00O0i0ii = o0oiiooi11o1.I00O0i0ii(3, parcelI00Iooi00oi);
/* 192 */           IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 196 */           if (strongBinder != null) {
/* 201 */               IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 215 */               loiii0l0lii0 = iInterfaceQueryLocalInterface instanceof liiiOl01O ? (liiiOl01O) iInterfaceQueryLocalInterface : new lOiIi0l0lII0(strongBinder);
                    }
/* 218 */           parcelI00O0i0ii.recycle();
/* 408 */           return loiii0l0lii0;
                }

                public final o0oIIOoI11O1 I0000Il00O(l0IIO1Oi0lOi l0iio1oi0loi) {
                    o0oIIOoI11O1 o0oiiooi11o1;
/* 3 */             this.I000OOo1O.isPresent();
/* 8 */             il11il01o il11il01oVarI00000oIO = this.I00000oOI.I00000oIO();
/* 12 */            io101O1Il io101o1il = (io101O1Il) l0iio1oi0loi;
/* 14 */            Parcel parcelI00Iooi00oi = io101o1il.I00Iooi00oi();
/* 18 */            int i = iil0Ii00oOI1.I00000oIO;
/* 21 */            parcelI00Iooi00oi.writeInt(1);
/* 25 */            il11il01oVarI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 29 */            Parcel parcelI00O0i0ii = io101o1il.I00O0i0ii(6, parcelI00Iooi00oi);
/* 33 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 37 */            if (strongBinder == null) {
/* 39 */                o0oiiooi11o1 = null;
                    } else {
/* 43 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationService");
/* 58 */                o0oiiooi11o1 = iInterfaceQueryLocalInterface instanceof o0oIIOoI11O1 ? (o0oIIOoI11O1) iInterfaceQueryLocalInterface : new o0oIIOoI11O1(strongBinder, "com.google.android.apps.aicore.aidl.ISummarizationService", 5);
                    }
/* 62 */            parcelI00O0i0ii.recycle();
/* 77 */            return o0oiiooi11o1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final ListenableFuture I0000O() {
                    ListenableFuture listenableFutureI0000O;
                    ioo10O ioo10o;
                    synchronized (this.I0001Ioi1lo) {
                        try {
/* 4 */                     l0Io11IiO0l l0io11iio0l = this.I000II;
/* 8 */                     il00iIOo1 il00iioo1 = (il00iIOo1) this.I00000oIO;
/* 18 */                    if (l0io11iio0l == il00iioo1.I00000oIO().I0000Il00O() && (ioo10o = this.I000O01llI0) != null) {
/* 25 */                        return ioo10o;
                            }
/* 29 */                    i1O01oOIoI0I i1o01ooioi0i = this.I0000Il00O;
/* 33 */                    int i = 0;
/* 33 */                    Object[] objArr = 0;
/* 33 */                    Object[] objArr2 = 0;
/* 34 */                    if (il00iioo1.I00io1l) {
/* 39 */                        iOli1OIoI0o ioli1oioi0o = this.I00000oOI;
/* 41 */                        il00iioo1.I000II();
/* 63 */                        iol1Io1 iol1io1I0000Il00O = lioo0lo01i.I0000Il00O(ioo10O.I000o00OoI0I(il00iioo1.I00000oIO().I0000Il00O()), new iiiilII0i(), iollol1ioIi.I00iOIl);
/* 70 */                        ii111o0I ii111o0i = new ii111o0I(3);
/* 73 */                        ii111o0i.I00000oOI = ioli1oioi0o;
/* 75 */                        VarHandle.storeStoreFence();
/* 84 */                        ioo10O ioo10oI000o00OoI0I = ioo10O.I000o00OoI0I(lioo0lo01i.I0000O(iol1io1I0000Il00O, ii111o0i, il00iioo1.I00iOIl));
/* 90 */                        ii100IIOI1 ii100iioi1 = new ii100IIOI1(objArr == true ? 1 : 0);
/* 93 */                        ii100iioi1.I00000oOI = this;
/* 95 */                        ii100iioi1.I0000Il00O = i1o01ooioi0i;
/* 97 */                        VarHandle.storeStoreFence();
/* 102 */                       listenableFutureI0000O = lioo0lo01i.I0000O(ioo10oI000o00OoI0I, ii100iioi1, this.I0000O);
                            } else {
/* 36 */                        listenableFutureI0000O = l00lIloiio.I00iiI;
                            }
/* 106 */                   ioo10O ioo10oI000o00OoI0I2 = ioo10O.I000o00OoI0I(listenableFutureI0000O);
/* 112 */                   ii111o0I ii111o0i2 = new ii111o0I(i);
/* 115 */                   ii111o0i2.I00000oOI = this;
/* 117 */                   VarHandle.storeStoreFence();
/* 120 */                   l01oII l01oii = this.I0000O;
/* 122 */                   iol0l1Iooll iol0l1ioollI0000O = lioo0lo01i.I0000O(ioo10oI000o00OoI0I2, ii111o0i2, l01oii);
/* 129 */                   ii111o0I ii111o0i3 = new ii111o0I(1);
/* 132 */                   ii111o0i3.I00000oOI = this;
/* 134 */                   VarHandle.storeStoreFence();
/* 137 */                   iol0l1Iooll iol0l1ioollI0000O2 = lioo0lo01i.I0000O(iol0l1ioollI0000O, ii111o0i3, l01oii);
/* 141 */                   this.I000O01llI0 = iol0l1ioollI0000O2;
/* 151 */                   this.I000II = il00iioo1.I00000oIO().I0000Il00O();
/* 157 */                   Oi1ol0llI oi1ol0llI = new Oi1ol0llI(24, (boolean) (objArr2 == true ? 1 : 0));
/* 160 */                   oi1ol0llI.I00iiI = this;
/* 162 */                   VarHandle.storeStoreFence();
/* 165 */                   Executor executor = iollol1ioIi.I00iOIl;
/* 169 */                   l0001OI0 l0001oi0 = new l0001OI0(0);
/* 172 */                   l0001oi0.I00iiI = iol0l1ioollI0000O2;
/* 174 */                   l0001oi0.I00iiO = oi1ol0llI;
/* 176 */                   VarHandle.storeStoreFence();
/* 179 */                   iol0l1ioollI0000O2.addListener(l0001oi0, executor);
/* 183 */                   return iol0l1ioollI0000O2;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }
            }
