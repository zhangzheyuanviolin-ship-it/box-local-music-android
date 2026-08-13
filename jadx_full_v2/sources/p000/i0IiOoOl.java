            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.play.core.assetpacks.ExtractionForegroundService;
            import java.util.Arrays;
            
            public final class i0IiOoOl extends i0IiIO {
                public OlOilIlol1 I000O01llI0;
                public Context I000OOo1O;
                public i0Il00O1 I000OiO;
                public i0OOOllloIII I000iOII;
                public i0O0i11IO0l0 I000l1;
                public i0OI0oooo I000lI;

                @Override
                public final boolean I00IoIO0lI(int i, Parcel parcel) {
                    String[] packagesForUid;
/* 1 */             i0OOOOol1Il i0oooool1il = null;
/* 5 */             if (i != 2) {
/* 8 */                 if (i != 3) {
/* 3 */                     return false;
                        }
/* 11 */                Parcelable.Creator creator = Bundle.CREATOR;
/* 19 */                IBinder strongBinder = parcel.readStrongBinder();
/* 23 */                if (strongBinder != null) {
/* 28 */                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
/* 41 */                    i0oooool1il = iInterfaceQueryLocalInterface instanceof i0OOOOol1Il ? (i0OOOOol1Il) iInterfaceQueryLocalInterface : new i0OOOOol1Il(strongBinder);
                        }
/* 44 */                i0IoOOOoOIoI.I00000oOI(parcel);
/* 53 */                this.I000O01llI0.I00000oIO("clearAssetPackStorage AIDL call", new Object[0]);
/* 56 */                Context context = this.I000OOo1O;
/* 62 */                if (!i0IIOO.I00000oIO(context) || (packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains("com.android.vending")) {
/* 124 */                   i0oooool1il.I00OI1(new Bundle());
/* 2 */                     return true;
                        }
/* 96 */                i0Il00O1.I000O01llI0(this.I000OiO.I0000O());
/* 101 */               Bundle bundle = new Bundle();
/* 104 */               Parcel parcelI00000oOI = i0oooool1il.I00000oOI();
/* 108 */               parcelI00000oOI.writeInt(1);
/* 111 */               bundle.writeToParcel(parcelI00000oOI, 0);
/* 115 */               i0oooool1il.I0000O(4, parcelI00000oOI);
/* 2 */                 return true;
                    }
/* 128 */           Parcelable.Creator creator2 = Bundle.CREATOR;
/* 134 */           Bundle bundle2 = (Bundle) i0IoOOOoOIoI.I00000oIO(parcel);
/* 136 */           IBinder strongBinder2 = parcel.readStrongBinder();
/* 140 */           if (strongBinder2 != null) {
/* 145 */               IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
/* 158 */               i0oooool1il = iInterfaceQueryLocalInterface2 instanceof i0OOOOol1Il ? (i0OOOOol1Il) iInterfaceQueryLocalInterface2 : new i0OOOOol1Il(strongBinder2);
                    }
/* 161 */           i0IoOOOoOIoI.I00000oOI(parcel);
                    synchronized (this) {
/* 171 */               this.I000O01llI0.I00000oIO("updateServiceState AIDL call", new Object[0]);
/* 180 */               if (i0IIOO.I00000oIO(this.I000OOo1O)) {
/* 192 */                   String[] packagesForUid2 = this.I000OOo1O.getPackageManager().getPackagesForUid(Binder.getCallingUid());
/* 213 */                   if (packagesForUid2 != null && Arrays.asList(packagesForUid2).contains("com.android.vending")) {
/* 219 */                       int i2 = bundle2.getInt("action_type");
/* 223 */                       i0O0i11IO0l0 i0o0i11io0l0 = this.I000l1;
                                synchronized (i0o0i11io0l0.I00iiI) {
/* 230 */                           i0o0i11io0l0.I00iiI.add(i0oooool1il);
                                }
/* 234 */                       if (i2 == 1) {
/* 238 */                           this.I000lI.I00000oOI(bundle2);
/* 243 */                           this.I000iOII.I00000oIO(true);
/* 254 */                           this.I000l1.I00ilI0I1 = this.I000lI.I00000oIO(bundle2);
/* 269 */                           this.I000OOo1O.bindService(new Intent(this.I000OOo1O, (Class<?>) ExtractionForegroundService.class), this.I000l1, 1);
/* 2 */                             return true;
                                }
/* 276 */                       if (i2 != 2) {
/* 332 */                           this.I000O01llI0.I00000oOI("Unknown action type received: %d", Integer.valueOf(i2));
/* 340 */                           i0oooool1il.I00OI1(new Bundle());
/* 2 */                             return true;
                                }
/* 280 */                       this.I000iOII.I00000oIO(false);
/* 283 */                       i0O0i11IO0l0 i0o0i11io0l02 = this.I000l1;
/* 291 */                       i0o0i11io0l02.I00iOIl.I00000oIO("Stopping foreground installation service.", new Object[0]);
/* 296 */                       i0o0i11io0l02.I00iiO.unbindService(i0o0i11io0l02);
/* 299 */                       ExtractionForegroundService extractionForegroundService = i0o0i11io0l02.I00iio;
/* 301 */                       if (extractionForegroundService != null) {
                                    synchronized (extractionForegroundService) {
/* 304 */                               extractionForegroundService.stopForeground(true);
/* 307 */                               extractionForegroundService.stopSelf();
                                    }
                                }
/* 315 */                       i0o0i11io0l02.I00000oIO();
/* 2 */                         return true;
                            }
                        }
/* 353 */               i0oooool1il.I00OI1(new Bundle());
/* 2 */                 return true;
                    }
                }
            }
