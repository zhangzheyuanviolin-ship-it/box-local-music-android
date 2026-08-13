            package com.google.mlkit.vision.face.internal;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import android.util.Pair;
            import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import com.google.mlkit.vision.face.Face;
            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.IioI1I1llol1;
            import p000.IioIOllO1;
            import p000.IioIii0IO;
            import p000.IoOlilli0ol;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.OIiil10iiO;
            import p000.iil0OoIIiIOO;
            import p000.lIIi1il;
            import p000.lO0IioIooIl;
            import p000.li10lI1;
            import p000.liOl11Ooi0iI;
            import p000.lii0IOlOO1;
            import p000.liiIOl01o01;
            import p000.liiOiil0I00;
            import p000.liilOlo0;
            import p000.liiollIol0;
            
            final class zza implements zzb {
                private final Context zza;
                private final FaceDetectorOptions zzb;
                private boolean zzc;
                private boolean zzd;
                private boolean zze;
                private final li10lI1 zzf;
                private liiIOl01o01 zzg;
                private liiIOl01o01 zzh;

                public zza(Context context, FaceDetectorOptions faceDetectorOptions, li10lI1 li10li1) {
/* 4 */             this.zza = context;
/* 6 */             this.zzb = faceDetectorOptions;
/* 8 */             this.zzf = li10li1;
                }

                public static boolean zzc(Context context) {
                    return IioIii0IO.I00000oIO(context, ModuleDescriptor.MODULE_ID) > 0;
                }

                private final void zzf() {
/* 8 */             if (this.zzb.zzc() != 2) {
/* 114 */               if (this.zzh == null) {
/* 156 */                   this.zzh = zzg(new liOl11Ooi0iI(this.zzb.zze(), this.zzb.zzd(), this.zzb.zzb(), 1, this.zzb.zzg(), this.zzb.zza()));
/* 541 */                   return;
                        }
/* 541 */               return;
                    }
/* 12 */            if (this.zzg == null) {
/* 39 */                this.zzg = zzg(new liOl11Ooi0iI(this.zzb.zze(), 1, 1, 2, false, this.zzb.zza()));
                    }
/* 47 */            if ((this.zzb.zzd() == 2 || this.zzb.zzb() == 2 || this.zzb.zze() == 2) && this.zzh == null) {
/* 109 */               this.zzh = zzg(new liOl11Ooi0iI(this.zzb.zze(), this.zzb.zzd(), this.zzb.zzb(), 1, this.zzb.zzg(), this.zzb.zza()));
                    }
                }

                private final liiIOl01o01 zzg(liOl11Ooi0iI liol11ooi0ii) {
                    return this.zzd ? zze(IioIii0IO.I0000Il00O, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", liol11ooi0ii) : zze(IioIii0IO.I00000oOI, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", liol11ooi0ii);
                }

                private static List zzh(liiIOl01o01 liiiol01o01, InputImage inputImage) throws O1o01iO0liI0 {
/* 6 */             if (inputImage.getFormat() == -1) {
/* 31 */                inputImage = InputImage.fromByteBuffer(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees(), 17);
                    }
/* 35 */            int format = inputImage.getFormat();
/* 39 */            int width = inputImage.getWidth();
/* 43 */            int height = inputImage.getHeight();
/* 51 */            int iConvertToMVRotation = CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees());
/* 55 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 63 */            IoOlilli0ol imageDataWrapper = ImageUtils.getInstance().getImageDataWrapper(inputImage);
                    try {
/* 67 */                Parcel parcelI00Iooi00oi = liiiol01o01.I00Iooi00oi();
/* 71 */                iil0OoIIiIOO.I00000oIO(parcelI00Iooi00oi, imageDataWrapper);
/* 75 */                parcelI00Iooi00oi.writeInt(1);
/* 80 */                int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 85 */                lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 1, 4);
/* 88 */                parcelI00Iooi00oi.writeInt(format);
/* 92 */                lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 2, 4);
/* 95 */                parcelI00Iooi00oi.writeInt(width);
/* 99 */                lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 3, 4);
/* 102 */               parcelI00Iooi00oi.writeInt(height);
/* 105 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 4, 4);
/* 108 */               parcelI00Iooi00oi.writeInt(iConvertToMVRotation);
/* 114 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 5, 8);
/* 117 */               parcelI00Iooi00oi.writeLong(jElapsedRealtime);
/* 120 */               lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 123 */               Parcel parcelI00O0i0ii = liiiol01o01.I00O0i0ii(3, parcelI00Iooi00oi);
/* 129 */               ArrayList arrayListCreateTypedArrayList = parcelI00O0i0ii.createTypedArrayList(lii0IOlOO1.CREATOR);
/* 133 */               parcelI00O0i0ii.recycle();
/* 138 */               ArrayList arrayList = new ArrayList();
/* 141 */               Iterator it = arrayListCreateTypedArrayList.iterator();
/* 149 */               while (it.hasNext()) {
/* 166 */                   arrayList.add(new Face((lii0IOlOO1) it.next(), inputImage.getCoordinatesMatrix()));
                        }
/* 170 */               return arrayList;
                    } catch (RemoteException e) {
/* 551 */               throw new O1o01iO0liI0(13, e, "Failed to run face detector.");
                    }
                }

                @Override
                public final Pair zza(InputImage inputImage) throws O1o01iO0liI0 {
                    List listZzh;
/* 3 */             if (this.zzh == null && this.zzg == null) {
/* 9 */                 zzd();
                    }
/* 14 */            if (!this.zzc) {
                        try {
/* 16 */                    liiIOl01o01 liiiol01o01 = this.zzh;
/* 19 */                    if (liiiol01o01 != null) {
/* 25 */                        liiiol01o01.I00O0o1oo(1, liiiol01o01.I00Iooi00oi());
                            }
/* 28 */                    liiIOl01o01 liiiol01o012 = this.zzg;
/* 30 */                    if (liiiol01o012 != null) {
/* 36 */                        liiiol01o012.I00O0o1oo(1, liiiol01o012.I00Iooi00oi());
                            }
/* 39 */                    this.zzc = true;
                        } catch (RemoteException e) {
/* 52 */                    throw new O1o01iO0liI0(13, e, "Failed to init face detector.");
                        }
                    }
/* 53 */            liiIOl01o01 liiiol01o013 = this.zzh;
/* 55 */            List listZzh2 = null;
/* 56 */            if (liiiol01o013 != null) {
/* 58 */                listZzh = zzh(liiiol01o013, inputImage);
/* 68 */                if (!this.zzb.zzg()) {
/* 70 */                    zzh.zzf(listZzh);
                        }
                    } else {
/* 74 */                listZzh = null;
                    }
/* 75 */            liiIOl01o01 liiiol01o014 = this.zzg;
/* 77 */            if (liiiol01o014 != null) {
/* 79 */                listZzh2 = zzh(liiiol01o014, inputImage);
/* 83 */                zzh.zzf(listZzh2);
                    }
/* 88 */            return new Pair(listZzh, listZzh2);
                }

                @Override
                public final void zzb() {
                    try {
/* 1 */                 liiIOl01o01 liiiol01o01 = this.zzh;
/* 5 */                 if (liiiol01o01 != null) {
/* 11 */                    liiiol01o01.I00O0o1oo(2, liiiol01o01.I00Iooi00oi());
/* 14 */                    this.zzh = null;
                        }
/* 19 */                liiIOl01o01 liiiol01o012 = this.zzg;
/* 21 */                if (liiiol01o012 != null) {
/* 27 */                    liiiol01o012.I00O0o1oo(2, liiiol01o012.I00Iooi00oi());
/* 30 */                    this.zzg = null;
                        }
                    } catch (RemoteException e) {
/* 37 */                Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
                    }
/* 41 */            this.zzc = false;
                }

                @Override
                public final boolean zzd() throws O1o01iO0liI0 {
/* 3 */             if (this.zzh != null || this.zzg != null) {
/* 116 */               return this.zzd;
                    }
/* 21 */            if (IioIii0IO.I00000oIO(this.zza, ModuleDescriptor.MODULE_ID) > 0) {
/* 23 */                this.zzd = true;
                        try {
/* 25 */                    zzf();
                        } catch (IioI1I1llol1 e) {
/* 46 */                    throw new O1o01iO0liI0(13, e, "Failed to load the bundled face module.");
                        } catch (RemoteException e2) {
/* 37 */                    throw new O1o01iO0liI0(13, e2, "Failed to create thick face detector.");
                        }
                    } else {
/* 48 */                this.zzd = false;
                        try {
/* 50 */                    zzf();
                        } catch (IioI1I1llol1 e3) {
/* 86 */                    if (!this.zze) {
/* 92 */                        OIiil10iiO.I00000oOI(this.zza, "face");
/* 95 */                        this.zze = true;
                            }
/* 103 */                   zzj.zzc(this.zzf, this.zzd, lIIi1il.OPTIONAL_MODULE_NOT_AVAILABLE);
/* 115 */                   throw new O1o01iO0liI0(14, e3, "Waiting for the face module to be downloaded. Please wait.");
                        } catch (RemoteException e4) {
/* 72 */                    zzj.zzc(this.zzf, this.zzd, lIIi1il.OPTIONAL_MODULE_INIT_ERROR);
/* 82 */                    throw new O1o01iO0liI0(13, e4, "Failed to create thin face detector.");
                        }
                    }
/* 59 */            zzj.zzc(this.zzf, this.zzd, lIIi1il.NO_ERROR);
/* 62 */            return this.zzd;
                }

                public final liiIOl01o01 zze(IioIOllO1 iioIOllO1, String str, String str2, liOl11Ooi0iI liol11ooi0ii) throws IioI1I1llol1 {
                    liiollIol0 liioiil0i00;
/* 7 */             IBinder iBinderI00000oOI = IioIii0IO.I0000Il00O(this.zza, iioIOllO1, str).I00000oOI(str2);
/* 11 */            int i = liilOlo0.I000O01llI0;
/* 14 */            liiIOl01o01 liiiol01o01 = null;
/* 15 */            if (iBinderI00000oOI == null) {
/* 17 */                liioiil0i00 = null;
                    } else {
/* 21 */                IInterface iInterfaceQueryLocalInterface = iBinderI00000oOI.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
/* 34 */                liioiil0i00 = iInterfaceQueryLocalInterface instanceof liiollIol0 ? (liiollIol0) iInterfaceQueryLocalInterface : new liiOiil0I00(iBinderI00000oOI, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator", 7);
                    }
/* 39 */            OIOiOlIO01 oIOiOlIO01I00O10llo = OIOiOlIO01.I00O10llo(this.zza);
/* 43 */            liiOiil0I00 liioiil0i002 = (liiOiil0I00) liioiil0i00;
/* 45 */            Parcel parcelI00Iooi00oi = liioiil0i002.I00Iooi00oi();
/* 49 */            iil0OoIIiIOO.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01I00O10llo);
/* 53 */            parcelI00Iooi00oi.writeInt(1);
/* 57 */            liol11ooi0ii.writeToParcel(parcelI00Iooi00oi, 0);
/* 60 */            Parcel parcelI00O0i0ii = liioiil0i002.I00O0i0ii(1, parcelI00Iooi00oi);
/* 64 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 68 */            if (strongBinder != null) {
/* 73 */                IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
/* 87 */                liiiol01o01 = iInterfaceQueryLocalInterface2 instanceof liiIOl01o01 ? (liiIOl01o01) iInterfaceQueryLocalInterface2 : new liiIOl01o01(strongBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector", 7);
                    }
/* 91 */            parcelI00O0i0ii.recycle();
/* 483 */           return liiiol01o01;
                }
            }
