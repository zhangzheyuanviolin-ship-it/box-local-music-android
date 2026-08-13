            package p000;

            import android.app.Notification;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.ServiceConnection;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.play.core.assetpacks.ExtractionForegroundService;
            import java.util.ArrayList;
            
/* 47 */    public final class i0O0i11IO0l0 implements ServiceConnection {
                public OlOilIlol1 I00iOIl;
                public ArrayList I00iiI;
                public Context I00iiO;
                public ExtractionForegroundService I00iio;
                public Notification I00ilI0I1;

                public final void I00000oIO() {
                    ArrayList arrayList;
                    synchronized (this.I00iiI) {
/* 8 */                 arrayList = new ArrayList(this.I00iiI);
/* 13 */                this.I00iiI.clear();
                    }
/* 17 */            int size = arrayList.size();
/* 23 */            for (int i = 0; i < size; i++) {
/* 29 */                i0OOOOol1Il i0oooool1il = (i0OOOOol1Il) arrayList.get(i);
                        try {
/* 33 */                    Bundle bundle = new Bundle();
/* 38 */                    Bundle bundle2 = new Bundle();
/* 41 */                    Parcel parcelI00000oOI = i0oooool1il.I00000oOI();
/* 45 */                    int i2 = i0IoOOOoOIoI.I00000oIO;
/* 48 */                    parcelI00000oOI.writeInt(1);
/* 51 */                    bundle.writeToParcel(parcelI00000oOI, 0);
/* 54 */                    parcelI00000oOI.writeInt(1);
/* 57 */                    bundle2.writeToParcel(parcelI00000oOI, 0);
/* 61 */                    i0oooool1il.I0000O(2, parcelI00000oOI);
                        } catch (RemoteException unused) {
/* 71 */                    this.I00iOIl.I00000oOI("Could not resolve Play Store service state update callback.", new Object[0]);
                        }
                    }
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 8 */             this.I00iOIl.I00000oIO("Starting foreground installation service.", new Object[0]);
/* 13 */            ExtractionForegroundService extractionForegroundService = ((i0O0Ooi00) iBinder).I000II;
/* 15 */            this.I00iio = extractionForegroundService;
/* 22 */            extractionForegroundService.startForeground(-1883842196, this.I00ilI0I1);
/* 25 */            I00000oIO();
                }

                @Override
/* 48 */        public final void onServiceDisconnected(ComponentName componentName) {
                }
            }
