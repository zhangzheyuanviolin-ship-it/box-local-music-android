            package com.google.mlkit.vision.face.internal;

            import android.content.Context;
            import android.media.Image;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import android.util.Pair;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import com.google.mlkit.vision.face.Face;
            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import java.util.ArrayList;
            import java.util.List;
            import p000.I000II;
            import p000.IioI1I1llol1;
            import p000.IioIii0IO;
            import p000.Io0iI1l01il;
            import p000.Io0ii0lOoi;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.OIiil10iiO;
            import p000.Oi010OO0;
            import p000.iil0OoIIiIOO;
            import p000.io0oIoliO1;
            import p000.l0IIOl11l;
            import p000.l1O1Io0I100;
            import p000.l1ol1oIOolo;
            import p000.lII0I0I000I;
            import p000.lIIi1il;
            import p000.lIOio0oi;
            import p000.lO0i01Ilool;
            import p000.li10lI1;
            import p000.liiOlo1O01o;
            
            final class zzm implements zzb {
                private boolean zza;
                private final Context zzb;
                private final FaceDetectorOptions zzc;
                private final int zzd;
                private final li10lI1 zze;
                private l1O1Io0I100 zzf;
                private l1O1Io0I100 zzg;

                public zzm(Context context, FaceDetectorOptions faceDetectorOptions, li10lI1 li10li1) {
/* 4 */             this.zzb = context;
/* 6 */             this.zzc = faceDetectorOptions;
/* 10 */            Io0iI1l01il.I00000oOI.getClass();
/* 17 */            this.zzd = Io0ii0lOoi.I00000oIO(context);
/* 19 */            this.zze = li10li1;
                }

                public static int zzc(int i) {
/* 2 */             if (i == 1) {
/* 19 */                return 0;
                    }
/* 5 */             if (i == 2) {
/* 1 */                 return 1;
                    }
/* 14 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Invalid classification type: "));
/* 17 */            return 0;
                }

                public static int zze(int i) {
/* 2 */             if (i == 1) {
/* 19 */                return 0;
                    }
/* 5 */             if (i == 2) {
/* 1 */                 return 1;
                    }
/* 14 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Invalid landmark type: "));
/* 17 */            return 0;
                }

                private static int zzf(int i) {
/* 2 */             if (i == 1) {
/* 19 */                return 0;
                    }
/* 5 */             if (i == 2) {
/* 1 */                 return 1;
                    }
/* 14 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Invalid mode type: "));
/* 17 */            return 0;
                }

                private final List zzg(l1O1Io0I100 l1o1io0i100, InputImage inputImage) throws O1o01iO0liI0 {
                    io0oIoliO1[] io0oiolio1ArrI00OI1;
                    try {
/* 24 */                liiOlo1O01o liiolo1o01o = new liiOlo1O01o(inputImage.getWidth(), inputImage.getHeight(), 0, SystemClock.elapsedRealtime(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()));
/* 35 */                if (inputImage.getFormat() != 35 || this.zzd < 201500000) {
/* 142 */                   OIOiOlIO01 oIOiOlIO01I00O10llo = OIOiOlIO01.I00O10llo(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false));
/* 146 */                   Parcel parcelI00Iooi00oi = l1o1io0i100.I00Iooi00oi();
/* 150 */                   iil0OoIIiIOO.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01I00O10llo);
/* 153 */                   parcelI00Iooi00oi.writeInt(1);
/* 156 */                   liiolo1o01o.writeToParcel(parcelI00Iooi00oi, 0);
/* 159 */                   Parcel parcelI00O0i0ii = l1o1io0i100.I00O0i0ii(1, parcelI00Iooi00oi);
/* 169 */                   io0oIoliO1[] io0oiolio1Arr = (io0oIoliO1[]) parcelI00O0i0ii.createTypedArray(io0oIoliO1.CREATOR);
/* 171 */                   parcelI00O0i0ii.recycle();
/* 174 */                   io0oiolio1ArrI00OI1 = io0oiolio1Arr;
                        } else {
/* 44 */                    Image.Plane[] planes = inputImage.getPlanes();
/* 48 */                    lII0I0I000I.I000II(planes);
/* 127 */                   io0oiolio1ArrI00OI1 = l1o1io0i100.I00OI1(OIOiOlIO01.I00O10llo(planes[0].getBuffer()), OIOiOlIO01.I00O10llo(planes[1].getBuffer()), OIOiOlIO01.I00O10llo(planes[2].getBuffer()), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), liiolo1o01o);
                        }
/* 177 */               ArrayList arrayList = new ArrayList();
/* 181 */               for (io0oIoliO1 io0oiolio1 : io0oiolio1ArrI00OI1) {
/* 194 */                   arrayList.add(new Face(io0oiolio1, inputImage.getCoordinatesMatrix()));
                        }
/* 200 */               return arrayList;
                    } catch (RemoteException e) {
/* 551 */               throw new O1o01iO0liI0(13, e, "Failed to detect with legacy face detector");
                    }
                }

                @Override
                public final Pair zza(InputImage inputImage) throws O1o01iO0liI0 {
                    List listZzg;
/* 3 */             if (this.zzf == null && this.zzg == null) {
/* 9 */                 zzd();
                    }
/* 12 */            l1O1Io0I100 l1o1io0i100 = this.zzf;
/* 14 */            if (l1o1io0i100 == null && this.zzg == null) {
/* 30 */                throw new O1o01iO0liI0("Waiting for the face detection module to be downloaded. Please wait.", 14);
                    }
/* 31 */            List listZzg2 = null;
/* 32 */            if (l1o1io0i100 != null) {
/* 34 */                listZzg = zzg(l1o1io0i100, inputImage);
/* 44 */                if (!this.zzc.zzg()) {
/* 46 */                    zzh.zzf(listZzg);
                        }
                    } else {
/* 50 */                listZzg = null;
                    }
/* 51 */            l1O1Io0I100 l1o1io0i1002 = this.zzg;
/* 53 */            if (l1o1io0i1002 != null) {
/* 55 */                listZzg2 = zzg(l1o1io0i1002, inputImage);
/* 59 */                zzh.zzf(listZzg2);
                    }
/* 64 */            return new Pair(listZzg, listZzg2);
                }

                @Override
                public final void zzb() {
/* 1 */             l1O1Io0I100 l1o1io0i100 = this.zzf;
/* 9 */             if (l1o1io0i100 != null) {
                        try {
/* 15 */                    l1o1io0i100.I00O0o1oo(3, l1o1io0i100.I00Iooi00oi());
                        } catch (RemoteException e) {
/* 20 */                    Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
                        }
/* 23 */                this.zzf = null;
                    }
/* 25 */            l1O1Io0I100 l1o1io0i1002 = this.zzg;
/* 27 */            if (l1o1io0i1002 != null) {
                        try {
/* 33 */                    l1o1io0i1002.I00O0o1oo(3, l1o1io0i1002.I00Iooi00oi());
                        } catch (RemoteException e2) {
/* 38 */                    Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e2);
                        }
/* 41 */                this.zzg = null;
                    }
                }

                @Override
                public final boolean zzd() throws O1o01iO0liI0 {
                    lO0i01Ilool l1ol1oioolo;
/* 4 */             if (this.zzf != null || this.zzg != null) {
/* 3 */                 return false;
                    }
                    try {
/* 26 */                IBinder iBinderI00000oOI = IioIii0IO.I0000Il00O(this.zzb, IioIii0IO.I00000oOI, "com.google.android.gms.vision.dynamite").I00000oOI("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
/* 30 */                int i = lIOio0oi.I000O01llI0;
/* 34 */                if (iBinderI00000oOI == null) {
/* 36 */                    l1ol1oioolo = null;
                        } else {
/* 38 */                    IInterface iInterfaceQueryLocalInterface = iBinderI00000oOI.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
/* 53 */                    l1ol1oioolo = iInterfaceQueryLocalInterface instanceof lO0i01Ilool ? (lO0i01Ilool) iInterfaceQueryLocalInterface : new l1ol1oIOolo(iBinderI00000oOI, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 7);
                        }
/* 59 */                OIOiOlIO01 oIOiOlIO01I00O10llo = OIOiOlIO01.I00O10llo(this.zzb);
/* 70 */                if (this.zzc.zzc() == 2) {
/* 74 */                    if (this.zzg == null) {
/* 99 */                        this.zzg = ((l1ol1oIOolo) l1ol1oioolo).I00OI1(oIOiOlIO01I00O10llo, new l0IIOl11l(2, 2, 0, true, false, this.zzc.zza()));
                            }
/* 116 */                   if ((this.zzc.zzd() == 2 || this.zzc.zzb() == 2 || this.zzc.zze() == 2) && this.zzf == null) {
/* 192 */                       this.zzf = ((l1ol1oIOolo) l1ol1oioolo).I00OI1(oIOiOlIO01I00O10llo, new l0IIOl11l(zzf(this.zzc.zze()), zze(this.zzc.zzd()), zzc(this.zzc.zzb()), false, this.zzc.zzg(), this.zzc.zza()));
                            }
                        } else if (this.zzf == null) {
/* 253 */                   this.zzf = ((l1ol1oIOolo) l1ol1oioolo).I00OI1(oIOiOlIO01I00O10llo, new l0IIOl11l(zzf(this.zzc.zze()), zze(this.zzc.zzd()), zzc(this.zzc.zzb()), false, this.zzc.zzg(), this.zzc.zza()));
                        }
/* 257 */               if (this.zzf == null && this.zzg == null && !this.zza) {
/* 271 */                   OIiil10iiO.I00000oOI(this.zzb, "barcode");
/* 275 */                   this.zza = true;
                        }
/* 281 */               zzj.zzc(this.zze, false, lIIi1il.NO_ERROR);
/* 3 */                 return false;
                    } catch (IioI1I1llol1 e) {
/* 292 */               throw new O1o01iO0liI0(13, e, "Failed to load deprecated vision dynamite module.");
                    } catch (RemoteException e2) {
/* 300 */               throw new O1o01iO0liI0(13, e2, "Failed to create legacy face detector.");
                    }
                }
            }
