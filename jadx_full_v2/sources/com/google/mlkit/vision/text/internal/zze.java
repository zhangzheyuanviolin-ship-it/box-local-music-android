            package com.google.mlkit.vision.text.internal;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import com.google.mlkit.vision.text.Text;
            import p000.IioI1I1llol1;
            import p000.IioIii0IO;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.OIiil10iiO;
            import p000.iil0oIoIllOI;
            import p000.l0IIiOOll;
            import p000.l0o1iOI1ll0;
            import p000.l1O1OOIO0lI1;
            import p000.l1olil1;
            import p000.lII0I0I000I;
            import p000.lIOl1OOi;
            import p000.lO0IioIooIl;
            import p000.liiOo00;
            
            final class zze implements zzm {
                private final Context zza;
                private final liiOo00 zzb = new liiOo00(null);
                private boolean zzc;
                private l0IIiOOll zzd;

                public zze(Context context) {
/* 12 */            this.zza = context;
                }

                @Override
                public final Text zza(InputImage inputImage) throws O1o01iO0liI0 {
                    Bitmap bitmapConvertToUpRightBitmap;
                    int iConvertToMVRotation;
/* 3 */             if (this.zzd == null) {
/* 5 */                 zzb();
                    }
/* 10 */            if (this.zzd == null) {
/* 186 */               throw new O1o01iO0liI0("Waiting for the text recognition module to be downloaded. Please wait.", 14);
                    }
/* 18 */            if (inputImage.getFormat() == -1) {
/* 20 */                bitmapConvertToUpRightBitmap = inputImage.getBitmapInternal();
/* 28 */                iConvertToMVRotation = CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees());
                    } else {
/* 37 */                bitmapConvertToUpRightBitmap = ImageConvertUtils.getInstance().convertToUpRightBitmap(inputImage);
/* 41 */                iConvertToMVRotation = 0;
                    }
/* 42 */            OIOiOlIO01 oIOiOlIO01I00O10llo = OIOiOlIO01.I00O10llo(bitmapConvertToUpRightBitmap);
/* 46 */            int width = inputImage.getWidth();
/* 50 */            int height = inputImage.getHeight();
                    try {
/* 54 */                l0IIiOOll l0iiiooll = this.zzd;
/* 56 */                lII0I0I000I.I000II(l0iiiooll);
/* 59 */                Parcel parcelI00Iooi00oi = l0iiiooll.I00Iooi00oi();
/* 63 */                iil0oIoIllOI.I00000oIO(parcelI00Iooi00oi, oIOiOlIO01I00O10llo);
/* 67 */                parcelI00Iooi00oi.writeInt(1);
/* 72 */                int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 78 */                lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 2, 4);
/* 81 */                parcelI00Iooi00oi.writeInt(width);
/* 85 */                lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 3, 4);
/* 88 */                parcelI00Iooi00oi.writeInt(height);
/* 91 */                lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 4, 4);
/* 94 */                parcelI00Iooi00oi.writeInt(0);
/* 100 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 5, 8);
/* 105 */               parcelI00Iooi00oi.writeLong(0L);
/* 109 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 6, 4);
/* 112 */               parcelI00Iooi00oi.writeInt(iConvertToMVRotation);
/* 115 */               lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 118 */               Parcel parcelI00O0i0ii = l0iiiooll.I00O0i0ii(1, parcelI00Iooi00oi);
/* 128 */               lIOl1OOi[] liol1ooiArr = (lIOl1OOi[]) parcelI00O0i0ii.createTypedArray(lIOl1OOi.CREATOR);
/* 130 */               parcelI00O0i0ii.recycle();
/* 137 */               return zzk.zza(liol1ooiArr, inputImage.getCoordinatesMatrix());
                    } catch (RemoteException e) {
/* 152 */               throw new O1o01iO0liI0(13, e, "Failed to run legacy text recognizer.");
                    }
                }

                @Override
                public final void zzb() throws O1o01iO0liI0 {
                    l1olil1 l0o1ioi1ll0;
/* 3 */             if (this.zzd != null) {
/* 89 */                return;
                    }
                    try {
/* 20 */                IBinder iBinderI00000oOI = IioIii0IO.I0000Il00O(this.zza, IioIii0IO.I00000oOI, "com.google.android.gms.vision.dynamite").I00000oOI("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
/* 24 */                int i = l1O1OOIO0lI1.I000O01llI0;
/* 28 */                if (iBinderI00000oOI == null) {
/* 30 */                    l0o1ioi1ll0 = null;
                        } else {
/* 32 */                    IInterface iInterfaceQueryLocalInterface = iBinderI00000oOI.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
/* 48 */                    l0o1ioi1ll0 = iInterfaceQueryLocalInterface instanceof l1olil1 ? (l1olil1) iInterfaceQueryLocalInterface : new l0o1iOI1ll0(iBinderI00000oOI, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator", 9);
                        }
/* 62 */                l0IIiOOll l0iiioollI00OI1 = ((l0o1iOI1ll0) l0o1ioi1ll0).I00OI1(OIOiOlIO01.I00O10llo(this.zza), this.zzb);
/* 66 */                this.zzd = l0iiioollI00OI1;
/* 68 */                if (l0iiioollI00OI1 != null || this.zzc) {
/* 89 */                    return;
                        }
/* 78 */                OIiil10iiO.I00000oOI(this.zza, "ocr");
/* 82 */                this.zzc = true;
                    } catch (IioI1I1llol1 e) {
/* 97 */                throw new O1o01iO0liI0(13, e, "Failed to load deprecated vision dynamite module.");
                    } catch (RemoteException e2) {
/* 113 */               throw new O1o01iO0liI0(13, e2, "Failed to create legacy text recognizer.");
                    }
                }

                @Override
                public final void zzc() {
/* 1 */             l0IIiOOll l0iiiooll = this.zzd;
/* 3 */             if (l0iiiooll != null) {
                        try {
/* 10 */                    l0iiiooll.I00O0o1oo(2, l0iiiooll.I00Iooi00oi());
                        } catch (RemoteException e) {
/* 19 */                    Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
                        }
/* 23 */                this.zzd = null;
                    }
                }
            }
