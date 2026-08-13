            package androidx.core.app;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.text.TextUtils;
            import androidx.core.graphics.drawable.IconCompat;
            import java.lang.reflect.InvocationTargetException;
            import p000.OooOI0Il00l;
            import p000.OooOIIIO;
            import p000.OooOO0O0Olo;
            
            public class RemoteActionCompatParcelizer {
                public static RemoteActionCompat read(OooOI0Il00l oooOI0Il00l) {
/* 3 */             RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
/* 6 */             OooOO0O0Olo oooOO0O0OloI000II = remoteActionCompat.I00000oIO;
/* 8 */             boolean z = true;
/* 13 */            if (oooOI0Il00l.I0000oI00(1)) {
/* 16 */                oooOO0O0OloI000II = oooOI0Il00l.I000II();
                    }
/* 22 */            remoteActionCompat.I00000oIO = (IconCompat) oooOO0O0OloI000II;
/* 24 */            CharSequence charSequence = remoteActionCompat.I00000oOI;
/* 31 */            if (oooOI0Il00l.I0000oI00(2)) {
/* 45 */                charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((OooOIIIO) oooOI0Il00l).I0000oI00);
                    }
/* 47 */            remoteActionCompat.I00000oOI = charSequence;
/* 49 */            CharSequence charSequence2 = remoteActionCompat.I0000Il00O;
/* 56 */            if (oooOI0Il00l.I0000oI00(3)) {
/* 70 */                charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((OooOIIIO) oooOI0Il00l).I0000oI00);
                    }
/* 72 */            remoteActionCompat.I0000Il00O = charSequence2;
/* 83 */            remoteActionCompat.I0000O = (PendingIntent) oooOI0Il00l.I0001Ioi1lo(remoteActionCompat.I0000O, 4);
/* 85 */            boolean z2 = remoteActionCompat.I0000oI00;
/* 93 */            if (oooOI0Il00l.I0000oI00(5)) {
/* 109 */               z2 = ((OooOIIIO) oooOI0Il00l).I0000oI00.readInt() != 0;
                    }
/* 110 */           remoteActionCompat.I0000oI00 = z2;
/* 112 */           boolean z3 = remoteActionCompat.I0001Ioi1lo;
/* 119 */           if (!oooOI0Il00l.I0000oI00(6)) {
/* 121 */               z = z3;
                    } else if (((OooOIIIO) oooOI0Il00l).I0000oI00.readInt() == 0) {
/* 134 */               z = false;
                    }
/* 135 */           remoteActionCompat.I0001Ioi1lo = z;
/* 168 */           return remoteActionCompat;
                }

                public static void write(RemoteActionCompat remoteActionCompat, OooOI0Il00l oooOI0Il00l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             oooOI0Il00l.getClass();
/* 4 */             IconCompat iconCompat = remoteActionCompat.I00000oIO;
/* 7 */             oooOI0Il00l.I000O01llI0(1);
/* 10 */            oooOI0Il00l.I000OOo1O(iconCompat);
/* 13 */            CharSequence charSequence = remoteActionCompat.I00000oOI;
/* 16 */            oooOI0Il00l.I000O01llI0(2);
/* 22 */            Parcel parcel = ((OooOIIIO) oooOI0Il00l).I0000oI00;
/* 25 */            TextUtils.writeToParcel(charSequence, parcel, 0);
/* 28 */            CharSequence charSequence2 = remoteActionCompat.I0000Il00O;
/* 31 */            oooOI0Il00l.I000O01llI0(3);
/* 34 */            TextUtils.writeToParcel(charSequence2, parcel, 0);
/* 37 */            PendingIntent pendingIntent = remoteActionCompat.I0000O;
/* 40 */            oooOI0Il00l.I000O01llI0(4);
/* 43 */            parcel.writeParcelable(pendingIntent, 0);
/* 46 */            boolean z = remoteActionCompat.I0000oI00;
/* 49 */            oooOI0Il00l.I000O01llI0(5);
/* 52 */            parcel.writeInt(z ? 1 : 0);
/* 55 */            boolean z2 = remoteActionCompat.I0001Ioi1lo;
/* 58 */            oooOI0Il00l.I000O01llI0(6);
/* 61 */            parcel.writeInt(z2 ? 1 : 0);
                }
            }
