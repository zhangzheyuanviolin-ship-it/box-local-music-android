            package com.google.mlkit.vision.barcode.internal;

            import android.content.Context;
            import android.media.Image;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
            import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.IioI1I1llol1;
            import p000.IioIOllO1;
            import p000.IioIii0IO;
            import p000.IlIII1l;
            import p000.Io0iI1l01il;
            import p000.Io0ii0lOoi;
            import p000.IoOlilli0ol;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.OIiil10iiO;
            import p000.iil0IlOIo1Ol;
            import p000.il00ii;
            import p000.il0II0OO1;
            import p000.ilIIoll0ll;
            import p000.lII0I0I000I;
            import p000.lO0IioIooIl;
            import p000.liloI11ilO;
            import p000.lliO0i0Iii0;
            import p000.o0OiOio;
            import p000.o0oOI0O;
            import p000.o0ooo11OlIo;
            import p000.o100i1lOlII;
            import p000.o101I11iO;
            import p000.o101o10II0io;
            
            final class zzo implements zzm {
                private static final il0II0OO1 zza;
                private boolean zzb;
                private boolean zzc;
                private boolean zzd;
                private final Context zze;
                private final BarcodeScannerOptions zzf;
                private final o0OiOio zzg;
                private o0ooo11OlIo zzh;

                static {
/* 1 */             il00ii il00iiVar = il0II0OO1.I00iiI;
/* 7 */             Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
/* 12 */            liloI11ilO.I00000oIO(2, objArr);
/* 20 */            zza = new ilIIoll0ll(objArr, 2);
                }

                public zzo(Context context, BarcodeScannerOptions barcodeScannerOptions, o0OiOio o0oioio) {
/* 4 */             this.zze = context;
/* 6 */             this.zzf = barcodeScannerOptions;
/* 8 */             this.zzg = o0oioio;
                }

                public static boolean zzd(Context context) {
                    return IioIii0IO.I00000oIO(context, ModuleDescriptor.MODULE_ID) > 0;
                }

                @Override
                public final List zza(InputImage inputImage) throws O1o01iO0liI0 {
/* 3 */             if (this.zzh == null) {
/* 5 */                 zzc();
                    }
/* 8 */             o0ooo11OlIo o0ooo11olio = this.zzh;
/* 10 */            lII0I0I000I.I000II(o0ooo11olio);
/* 18 */            if (!this.zzb) {
                        try {
/* 24 */                    o0ooo11olio.I00O0o1oo(1, o0ooo11olio.I00Iooi00oi());
/* 27 */                    this.zzb = true;
                        } catch (RemoteException e) {
/* 38 */                    throw new O1o01iO0liI0(13, e, "Failed to init barcode scanner.");
                        }
                    }
/* 39 */            int width = inputImage.getWidth();
/* 49 */            if (inputImage.getFormat() == 35) {
/* 51 */                Image.Plane[] planes = inputImage.getPlanes();
/* 55 */                lII0I0I000I.I000II(planes);
/* 61 */                width = planes[0].getRowStride();
                    }
/* 65 */            int format = inputImage.getFormat();
/* 69 */            int height = inputImage.getHeight();
/* 77 */            int iConvertToMVRotation = CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees());
/* 81 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 89 */            IoOlilli0ol imageDataWrapper = ImageUtils.getInstance().getImageDataWrapper(inputImage);
                    try {
/* 93 */                Parcel parcelI00Iooi00oi = o0ooo11olio.I00Iooi00oi();
/* 97 */                iil0IlOIo1Ol.I00000oIO(parcelI00Iooi00oi, imageDataWrapper);
/* 100 */               parcelI00Iooi00oi.writeInt(1);
/* 105 */               int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 110 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 1, 4);
/* 113 */               parcelI00Iooi00oi.writeInt(format);
/* 117 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 2, 4);
/* 120 */               parcelI00Iooi00oi.writeInt(width);
/* 124 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 3, 4);
/* 127 */               parcelI00Iooi00oi.writeInt(height);
/* 130 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 4, 4);
/* 133 */               parcelI00Iooi00oi.writeInt(iConvertToMVRotation);
/* 139 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 5, 8);
/* 142 */               parcelI00Iooi00oi.writeLong(jElapsedRealtime);
/* 145 */               lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 148 */               Parcel parcelI00O0i0ii = o0ooo11olio.I00O0i0ii(3, parcelI00Iooi00oi);
/* 154 */               ArrayList arrayListCreateTypedArrayList = parcelI00O0i0ii.createTypedArrayList(o0oOI0O.CREATOR);
/* 158 */               parcelI00O0i0ii.recycle();
/* 163 */               ArrayList arrayList = new ArrayList();
/* 166 */               Iterator it = arrayListCreateTypedArrayList.iterator();
/* 174 */               while (it.hasNext()) {
/* 196 */                   arrayList.add(new Barcode(new zzn((o0oOI0O) it.next()), inputImage.getCoordinatesMatrix()));
                        }
/* 200 */               return arrayList;
                    } catch (RemoteException e2) {
/* 966 */               throw new O1o01iO0liI0(13, e2, "Failed to run barcode scanner.");
                    }
                }

                @Override
                public final void zzb() {
/* 1 */             o0ooo11OlIo o0ooo11olio = this.zzh;
/* 3 */             if (o0ooo11olio != null) {
                        try {
/* 10 */                    o0ooo11olio.I00O0o1oo(2, o0ooo11olio.I00Iooi00oi());
                        } catch (RemoteException e) {
/* 19 */                    Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
                        }
/* 23 */                this.zzh = null;
/* 26 */                this.zzb = false;
                    }
                }

                @Override
                public final boolean zzc() throws O1o01iO0liI0 {
/* 3 */             if (this.zzh != null) {
/* 5 */                 return this.zzc;
                    }
/* 17 */            if (zzd(this.zze)) {
/* 19 */                this.zzc = true;
                        try {
/* 31 */                    this.zzh = zze(IioIii0IO.I0000Il00O, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
                        } catch (IioI1I1llol1 e) {
/* 54 */                    throw new O1o01iO0liI0(13, e, "Failed to load the bundled barcode module.");
                        } catch (RemoteException e2) {
/* 46 */                    throw new O1o01iO0liI0(13, e2, "Failed to create thick barcode scanner.");
                        }
                    } else {
/* 55 */                boolean zI00000oIO = false;
/* 56 */                this.zzc = false;
/* 58 */                Context context = this.zze;
/* 60 */                il0II0OO1 il0ii0oo1 = zza;
/* 62 */                IlIII1l[] ilIII1lArr = OIiil10iiO.I00000oIO;
/* 66 */                Io0iI1l01il.I00000oOI.getClass();
/* 76 */                if (Io0ii0lOoi.I00000oIO(context) >= 221500000) {
/* 84 */                    zI00000oIO = OIiil10iiO.I00000oIO(context, OIiil10iiO.I0000oI00(OIiil10iiO.I000l1, il0ii0oo1));
                        } else {
                            try {
/* 89 */                        il00ii il00iiVarListIterator = il0ii0oo1.listIterator(0);
/* 97 */                        while (il00iiVarListIterator.hasNext()) {
/* 107 */                           IioIii0IO.I0000Il00O(context, IioIii0IO.I00000oOI, (String) il00iiVarListIterator.next());
                                }
/* 111 */                       zI00000oIO = true;
                            } catch (IioI1I1llol1 unused) {
                            }
                        }
/* 112 */               if (!zI00000oIO) {
/* 116 */                   if (!this.zzd) {
/* 118 */                       Context context2 = this.zze;
/* 124 */                       Object[] objArr = {"barcode", "tflite_dynamite"};
/* 129 */                       liloI11ilO.I00000oIO(2, objArr);
/* 137 */                       OIiil10iiO.I0000Il00O(context2, new ilIIoll0ll(objArr, 2));
/* 140 */                       this.zzd = true;
                            }
/* 146 */                   zzb.zze(this.zzg, lliO0i0Iii0.OPTIONAL_MODULE_NOT_AVAILABLE);
/* 158 */                   throw new O1o01iO0liI0("Waiting for the barcode module to be downloaded. Please wait.", 14);
                        }
                        try {
/* 169 */                   this.zzh = zze(IioIii0IO.I00000oOI, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
                        } catch (IioI1I1llol1 | RemoteException e3) {
/* 186 */                   zzb.zze(this.zzg, lliO0i0Iii0.OPTIONAL_MODULE_INIT_ERROR);
/* 541 */                   throw new O1o01iO0liI0(13, e3, "Failed to create thin barcode scanner.");
                        }
                    }
/* 175 */           zzb.zze(this.zzg, lliO0i0Iii0.NO_ERROR);
/* 178 */           return this.zzc;
                }

                public final o0ooo11OlIo zze(IioIOllO1 iioIOllO1, String str, String str2) throws IioI1I1llol1 {
                    o101o10II0io o100i1lolii;
/* 7 */             IBinder iBinderI00000oOI = IioIii0IO.I0000Il00O(this.zze, iioIOllO1, str).I00000oOI(str2);
/* 11 */            int i = o101I11iO.I000O01llI0;
/* 14 */            o0ooo11OlIo o0ooo11olio = null;
/* 15 */            if (iBinderI00000oOI == null) {
/* 17 */                o100i1lolii = null;
                    } else {
/* 21 */                IInterface iInterfaceQueryLocalInterface = iBinderI00000oOI.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
/* 34 */                o100i1lolii = iInterfaceQueryLocalInterface instanceof o101o10II0io ? (o101o10II0io) iInterfaceQueryLocalInterface : new o100i1lOlII(iBinderI00000oOI, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 6);
                    }
/* 37 */            BarcodeScannerOptions barcodeScannerOptions = this.zzf;
/* 41 */            OIOiOlIO01 oIOiOlIO01I00O10llo = OIOiOlIO01.I00O10llo(this.zze);
/* 45 */            int iZza = barcodeScannerOptions.zza();
/* 66 */            int i2 = (barcodeScannerOptions.zzd() || this.zzf.zzb() != null) ? 1 : 0;
/* 67 */            o100i1lOlII o100i1lolii2 = (o100i1lOlII) o100i1lolii;
/* 69 */            Parcel parcelI00Iooi00oi = o100i1lolii2.I00Iooi00oi();
/* 73 */            iil0IlOIo1Ol.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01I00O10llo);
/* 76 */            parcelI00Iooi00oi.writeInt(1);
/* 81 */            int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 86 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 1, 4);
/* 89 */            parcelI00Iooi00oi.writeInt(iZza);
/* 93 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 2, 4);
/* 96 */            parcelI00Iooi00oi.writeInt(i2);
/* 99 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 102 */           Parcel parcelI00O0i0ii = o100i1lolii2.I00O0i0ii(1, parcelI00Iooi00oi);
/* 106 */           IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 110 */           if (strongBinder != null) {
/* 115 */               IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
/* 129 */               o0ooo11olio = iInterfaceQueryLocalInterface2 instanceof o0ooo11OlIo ? (o0ooo11OlIo) iInterfaceQueryLocalInterface2 : new o0ooo11OlIo(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 6);
                    }
/* 133 */           parcelI00O0i0ii.recycle();
/* 215 */           return o0ooo11olio;
                }
            }
