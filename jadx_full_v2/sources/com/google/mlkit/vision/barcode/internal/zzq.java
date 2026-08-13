            package com.google.mlkit.vision.barcode.internal;

            import android.content.Context;
            import android.media.Image;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import java.util.ArrayList;
            import java.util.List;
            import p000.IioI1I1llol1;
            import p000.IioIii0IO;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.OIiil10iiO;
            import p000.iI1oi10OOO;
            import p000.iIOooO;
            import p000.iIiil01o10li;
            import p000.iIlI1olloOOO;
            import p000.iIo00ilIil0;
            import p000.iIolOl1lo1;
            import p000.iil0IlOIo1Ol;
            import p000.lII0I0I000I;
            import p000.lliO0i0Iii0;
            import p000.loliloil;
            import p000.o0OiOio;
            
            final class zzq implements zzm {
                private boolean zza;
                private final Context zzb;
                private final iI1oi10OOO zzc;
                private final o0OiOio zzd;
                private iIOooO zze;

                public zzq(Context context, BarcodeScannerOptions barcodeScannerOptions, o0OiOio o0oioio) {
/* 6 */             iI1oi10OOO ii1oi10ooo = new iI1oi10OOO();
/* 9 */             this.zzc = ii1oi10ooo;
/* 11 */            this.zzb = context;
/* 17 */            ii1oi10ooo.I00iOIl = barcodeScannerOptions.zza();
/* 19 */            this.zzd = o0oioio;
                }

                @Override
                public final List zza(InputImage inputImage) throws O1o01iO0liI0 {
                    loliloil[] loliloilVarArrI00OI1;
/* 5 */             if (this.zze == null) {
/* 7 */                 zzc();
                    }
/* 10 */            iIOooO iioooo = this.zze;
/* 12 */            if (iioooo == null) {
/* 966 */               throw new O1o01iO0liI0("Error initializing the legacy barcode scanner.", 14);
                    }
/* 35 */            iIolOl1lo1 iiolol1lo1 = new iIolOl1lo1(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()));
                    try {
/* 38 */                int format = inputImage.getFormat();
/* 44 */                if (format == -1) {
/* 146 */                   OIOiOlIO01 oIOiOlIO01I00O10llo = OIOiOlIO01.I00O10llo(inputImage.getBitmapInternal());
/* 150 */                   Parcel parcelI00Iooi00oi = iioooo.I00Iooi00oi();
/* 154 */                   iil0IlOIo1Ol.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01I00O10llo);
/* 158 */                   parcelI00Iooi00oi.writeInt(1);
/* 161 */                   iiolol1lo1.writeToParcel(parcelI00Iooi00oi, 0);
/* 165 */                   Parcel parcelI00O0i0ii = iioooo.I00O0i0ii(2, parcelI00Iooi00oi);
/* 175 */                   loliloil[] loliloilVarArr = (loliloil[]) parcelI00O0i0ii.createTypedArray(loliloil.CREATOR);
/* 177 */                   parcelI00O0i0ii.recycle();
/* 180 */                   loliloilVarArrI00OI1 = loliloilVarArr;
                        } else if (format == 17) {
/* 137 */                   loliloilVarArrI00OI1 = iioooo.I00OI1(OIOiOlIO01.I00O10llo(inputImage.getByteBuffer()), iiolol1lo1);
                        } else if (format == 35) {
/* 99 */                    Image.Plane[] planes = inputImage.getPlanes();
/* 103 */                   lII0I0I000I.I000II(planes);
/* 112 */                   iiolol1lo1.I00iOIl = planes[0].getRowStride();
/* 124 */                   loliloilVarArrI00OI1 = iioooo.I00OI1(OIOiOlIO01.I00O10llo(planes[0].getBuffer()), iiolol1lo1);
                        } else {
/* 57 */                    if (format != 842094169) {
/* 98 */                        throw new O1o01iO0liI0("Unsupported image format: " + inputImage.getFormat(), 3);
                            }
/* 71 */                    loliloilVarArrI00OI1 = iioooo.I00OI1(OIOiOlIO01.I00O10llo(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false)), iiolol1lo1);
                        }
/* 183 */               ArrayList arrayList = new ArrayList();
/* 187 */               for (loliloil loliloilVar : loliloilVarArrI00OI1) {
/* 205 */                   arrayList.add(new Barcode(new zzp(loliloilVar), inputImage.getCoordinatesMatrix()));
                        }
/* 211 */               return arrayList;
                    } catch (RemoteException e) {
/* 223 */               throw new O1o01iO0liI0(13, e, "Failed to detect with legacy barcode detector");
                    }
                }

                @Override
                public final void zzb() {
/* 1 */             iIOooO iioooo = this.zze;
/* 3 */             if (iioooo != null) {
                        try {
/* 10 */                    iioooo.I00O0o1oo(3, iioooo.I00Iooi00oi());
                        } catch (RemoteException e) {
/* 19 */                    Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
                        }
/* 23 */                this.zze = null;
                    }
                }

                @Override
                public final boolean zzc() throws O1o01iO0liI0 {
                    iIo00ilIil0 iiiil01o10li;
/* 3 */             if (this.zze != null) {
/* 112 */               return false;
                    }
                    try {
/* 20 */                IBinder iBinderI00000oOI = IioIii0IO.I0000Il00O(this.zzb, IioIii0IO.I00000oOI, "com.google.android.gms.vision.dynamite").I00000oOI("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
/* 24 */                int i = iIlI1olloOOO.I000O01llI0;
/* 28 */                if (iBinderI00000oOI == null) {
/* 30 */                    iiiil01o10li = null;
                        } else {
/* 32 */                    IInterface iInterfaceQueryLocalInterface = iBinderI00000oOI.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
/* 47 */                    iiiil01o10li = iInterfaceQueryLocalInterface instanceof iIo00ilIil0 ? (iIo00ilIil0) iInterfaceQueryLocalInterface : new iIiil01o10li(iBinderI00000oOI, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 6);
                        }
/* 61 */                iIOooO iiooooI00OI1 = ((iIiil01o10li) iiiil01o10li).I00OI1(OIOiOlIO01.I00O10llo(this.zzb), this.zzc);
/* 65 */                this.zze = iiooooI00OI1;
/* 67 */                if (iiooooI00OI1 == null && !this.zza) {
/* 78 */                    OIiil10iiO.I00000oOI(this.zzb, "barcode");
/* 82 */                    this.zza = true;
/* 88 */                    zzb.zze(this.zzd, lliO0i0Iii0.OPTIONAL_MODULE_NOT_AVAILABLE);
/* 100 */                   throw new O1o01iO0liI0("Waiting for the barcode module to be downloaded. Please wait.", 14);
                        }
/* 109 */               zzb.zze(this.zzd, lliO0i0Iii0.NO_ERROR);
/* 112 */               return false;
                    } catch (IioI1I1llol1 e) {
/* 121 */               throw new O1o01iO0liI0(13, e, "Failed to load deprecated vision dynamite module.");
                    } catch (RemoteException e2) {
/* 541 */               throw new O1o01iO0liI0(13, e2, "Failed to create legacy barcode detector.");
                    }
                }
            }
