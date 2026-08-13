            package com.google.mlkit.vision.text.internal;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import com.google.mlkit.vision.text.Text;
            import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
            import p000.IIl001iO0Io;
            import p000.IioI1I1llol1;
            import p000.IioIii0IO;
            import p000.IoOlilli0ol;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.OIiil10iiO;
            import p000.iil0oIoIllOI;
            import p000.lII0I0I000I;
            import p000.lO0IioIooIl;
            import p000.liOiOolii;
            import p000.loloOlli1l0;
            import p000.loooII;
            import p000.o0000lo;
            import p000.o000OI1;
            import p000.o000oI1Ii0;
            import p000.o001O1;
            import p000.o001li;
            import p000.o00IOli;
            import p000.o010oI1oOli;
            import p000.o011OIooio;
            
            final class zzd implements zzm {
                private final Context zza;
                private final TextRecognizerOptionsInterface zzb;
                private boolean zzc;
                private boolean zzd;
                private final loloOlli1l0 zze;
                private o000oI1Ii0 zzf;

                public zzd(Context context, TextRecognizerOptionsInterface textRecognizerOptionsInterface, loloOlli1l0 loloolli1l0) {
/* 4 */             this.zza = context;
/* 6 */             this.zzb = textRecognizerOptionsInterface;
/* 8 */             this.zze = loloolli1l0;
                }

                private static o011OIooio zzd(TextRecognizerOptionsInterface textRecognizerOptionsInterface, String str) {
/* 4 */             int i = 1;
/* 18 */            boolean z = (textRecognizerOptionsInterface instanceof zzc) && ((zzc) textRecognizerOptionsInterface).zza();
/* 21 */            String configLabel = textRecognizerOptionsInterface.getConfigLabel();
/* 25 */            String loggingLibraryNameForOptionalModule = textRecognizerOptionsInterface.getLoggingLibraryNameForOptionalModule();
                    switch (textRecognizerOptionsInterface.getLoggingLanguageOption()) {
                        case 1:
/* 53 */                    i = 2;
                            break;
                        case 2:
/* 51 */                    i = 3;
                            break;
                        case 3:
/* 49 */                    i = 4;
                            break;
                        case 4:
/* 47 */                    i = 5;
                            break;
                        case 5:
/* 45 */                    i = 6;
                            break;
                        case 6:
/* 43 */                    i = 7;
                            break;
                        case 7:
/* 40 */                    i = 8;
                            break;
                        case 8:
/* 37 */                    i = 9;
                            break;
                    }
/* 62 */            return new o011OIooio(configLabel, loggingLibraryNameForOptionalModule, str, textRecognizerOptionsInterface.getLanguageHint(), i - 1, true, z);
                }

                @Override
                public final Text zza(InputImage inputImage) throws O1o01iO0liI0 {
/* 3 */             if (this.zzf == null) {
/* 5 */                 zzb();
                    }
/* 8 */             o000oI1Ii0 o000oi1ii0 = this.zzf;
/* 10 */            lII0I0I000I.I000II(o000oi1ii0);
/* 18 */            if (!this.zzc) {
                        try {
/* 24 */                    o000oi1ii0.I00O0o1oo(1, o000oi1ii0.I00Iooi00oi());
/* 27 */                    this.zzc = true;
                        } catch (RemoteException e) {
/* 52 */                    throw new O1o01iO0liI0(13, e, "Failed to init text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())));
                        }
                    }
/* 53 */            int format = inputImage.getFormat();
/* 57 */            int width = inputImage.getWidth();
/* 61 */            int height = inputImage.getHeight();
/* 69 */            int iConvertToMVRotation = CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees());
/* 73 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 81 */            IoOlilli0ol imageDataWrapper = ImageUtils.getInstance().getImageDataWrapper(inputImage);
                    try {
/* 85 */                Parcel parcelI00Iooi00oi = o000oi1ii0.I00Iooi00oi();
/* 89 */                iil0oIoIllOI.I00000oIO(parcelI00Iooi00oi, imageDataWrapper);
/* 92 */                parcelI00Iooi00oi.writeInt(1);
/* 97 */                int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 102 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 1, 4);
/* 105 */               parcelI00Iooi00oi.writeInt(format);
/* 109 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 2, 4);
/* 112 */               parcelI00Iooi00oi.writeInt(width);
/* 116 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 3, 4);
/* 119 */               parcelI00Iooi00oi.writeInt(height);
/* 122 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 4, 4);
/* 125 */               parcelI00Iooi00oi.writeInt(iConvertToMVRotation);
/* 131 */               lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 5, 8);
/* 134 */               parcelI00Iooi00oi.writeLong(jElapsedRealtime);
/* 137 */               lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 140 */               Parcel parcelI00O0i0ii = o000oi1ii0.I00O0i0ii(3, parcelI00Iooi00oi);
/* 154 */               o010oI1oOli o010oi1ooliCreateFromParcel = parcelI00O0i0ii.readInt() == 0 ? null : o010oI1oOli.CREATOR.createFromParcel(parcelI00O0i0ii);
/* 162 */               parcelI00O0i0ii.recycle();
/* 171 */               return new Text(o010oi1ooliCreateFromParcel, inputImage.getCoordinatesMatrix());
                    } catch (RemoteException e2) {
/* 966 */               throw new O1o01iO0liI0(13, e2, "Failed to run text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())));
                    }
                }

                @Override
                public final void zzb() throws O1o01iO0liI0 {
                    o000oI1Ii0 o000oi1ii0I00OI1;
/* 3 */             if (this.zzf != null) {
/* 5 */                 return;
                    }
                    try {
/* 9 */                 TextRecognizerOptionsInterface textRecognizerOptionsInterface = this.zzb;
/* 11 */                boolean z = textRecognizerOptionsInterface instanceof zzb;
/* 13 */                IInterface o001o1 = null;
/* 29 */                String strZza = z ? ((zzb) textRecognizerOptionsInterface).zza() : null;
/* 40 */                if (this.zzb.getIsThickClient()) {
/* 58 */                    IBinder iBinderI00000oOI = IioIii0IO.I0000Il00O(this.zza, IioIii0IO.I0000Il00O, this.zzb.getModuleId()).I00000oOI("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator");
/* 62 */                    int i = o001li.I000O01llI0;
/* 64 */                    if (iBinderI00000oOI != null) {
/* 67 */                        IInterface iInterfaceQueryLocalInterface = iBinderI00000oOI.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
/* 80 */                        o001o1 = iInterfaceQueryLocalInterface instanceof o00IOli ? (o00IOli) iInterfaceQueryLocalInterface : new o001O1(iBinderI00000oOI, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", 9);
                            }
/* 97 */                    o000oi1ii0I00OI1 = ((o001O1) o001o1).I00OIO1(OIOiOlIO01.I00O10llo(this.zza), zzd(this.zzb, strZza));
                        } else {
/* 103 */                   Context context = this.zza;
/* 105 */                   if (z) {
/* 121 */                       IBinder iBinderI00000oOI2 = IioIii0IO.I0000Il00O(context, IioIii0IO.I00000oOI, this.zzb.getModuleId()).I00000oOI("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator");
/* 125 */                       int i2 = o0000lo.I000O01llI0;
/* 129 */                       if (iBinderI00000oOI2 != null) {
/* 132 */                           IInterface iInterfaceQueryLocalInterface2 = iBinderI00000oOI2.queryLocalInterface("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
/* 145 */                           o001o1 = iInterfaceQueryLocalInterface2 instanceof o000OI1 ? (o000OI1) iInterfaceQueryLocalInterface2 : new loooII(iBinderI00000oOI2, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator", 9);
                                }
/* 162 */                       o000oi1ii0I00OI1 = ((loooII) o001o1).I00OI1(OIOiOlIO01.I00O10llo(this.zza), zzd(this.zzb, strZza));
                            } else {
/* 181 */                       IBinder iBinderI00000oOI3 = IioIii0IO.I0000Il00O(context, IioIii0IO.I00000oOI, this.zzb.getModuleId()).I00000oOI("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator");
/* 185 */                       int i3 = o001li.I000O01llI0;
/* 187 */                       if (iBinderI00000oOI3 != null) {
/* 190 */                           IInterface iInterfaceQueryLocalInterface3 = iBinderI00000oOI3.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
/* 203 */                           o001o1 = iInterfaceQueryLocalInterface3 instanceof o00IOli ? (o00IOli) iInterfaceQueryLocalInterface3 : new o001O1(iBinderI00000oOI3, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", 9);
                                }
/* 208 */                       int loggingLanguageOption = this.zzb.getLoggingLanguageOption();
/* 212 */                       Context context2 = this.zza;
/* 239 */                       o000oi1ii0I00OI1 = loggingLanguageOption == 1 ? ((o001O1) o001o1).I00OI1(OIOiOlIO01.I00O10llo(context2)) : ((o001O1) o001o1).I00OIO1(OIOiOlIO01.I00O10llo(context2), zzd(this.zzb, strZza));
                            }
                        }
/* 243 */               this.zzf = o000oi1ii0I00OI1;
/* 255 */               LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), liOiOolii.NO_ERROR);
                    } catch (IioI1I1llol1 e) {
/* 304 */               LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), liOiOolii.OPTIONAL_MODULE_NOT_AVAILABLE);
/* 313 */               if (this.zzb.getIsThickClient()) {
/* 541 */                   throw new O1o01iO0liI0(13, e, IIl001iO0Io.I000oI1ioi("Failed to load text module ", this.zzb.getLoggingLibraryName(), ". ", e.getMessage()));
                        }
/* 317 */               if (!this.zzd) {
/* 328 */                   OIiil10iiO.I0000O(this.zza, TextOptionalModuleUtils.zza(this.zzb));
/* 331 */                   this.zzd = true;
                        }
/* 342 */               throw new O1o01iO0liI0("Waiting for the text optional module to be downloaded. Please wait.", 14);
                    } catch (RemoteException e2) {
/* 269 */               LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), liOiOolii.OPTIONAL_MODULE_INIT_ERROR);
/* 293 */               throw new O1o01iO0liI0(13, e2, "Failed to create text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())));
                    }
                }

                @Override
                public final void zzc() {
/* 1 */             o000oI1Ii0 o000oi1ii0 = this.zzf;
/* 3 */             if (o000oi1ii0 != null) {
                        try {
/* 10 */                    o000oi1ii0.I00O0o1oo(2, o000oi1ii0.I00Iooi00oi());
                        } catch (RemoteException e) {
/* 33 */                    Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), e);
                        }
/* 37 */                this.zzf = null;
                    }
/* 40 */            this.zzc = false;
                }
            }
