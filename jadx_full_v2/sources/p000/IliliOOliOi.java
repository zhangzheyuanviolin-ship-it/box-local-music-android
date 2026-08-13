            package p000;

            import android.app.Notification;
            
            public final class IliliOOliOi {
                public final int I00000oIO;
                public final int I00000oOI;
                public final Notification I0000Il00O;

                public IliliOOliOi(int i, Notification notification, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I0000Il00O = notification;
/* 8 */             this.I00000oOI = i2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || IliliOOliOi.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            IliliOOliOi ililiOOliOi = (IliliOOliOi) obj;
/* 23 */            if (this.I00000oIO == ililiOOliOi.I00000oIO && this.I00000oOI == ililiOOliOi.I00000oOI) {
/* 37 */                return this.I0000Il00O.equals(ililiOOliOi.I0000Il00O);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 16 */            return this.I0000Il00O.hashCode() + (((this.I00000oIO * 31) + this.I00000oOI) * 31);
                }

                public final String toString() {
/* 38 */            return "ForegroundInfo{mNotificationId=" + this.I00000oIO + ", mForegroundServiceType=" + this.I00000oOI + ", mNotification=" + this.I0000Il00O + '}';
                }
            }
