            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIlOloloOil {
                public int I00000oIO;

                public static final IIlOloloOil I00000oIO(int i) {
/* 3 */             IIlOloloOil iIlOloloOil = new IIlOloloOil();
/* 6 */             iIlOloloOil.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iIlOloloOil;
                }

                public static String I00000oOI(int i) {
/* 102 */           return IlIi0I0.I000oI1ioi(new StringBuilder("CameraError("), i == 0 ? "ERROR_UNDETERMINED" : i == 1 ? "ERROR_CAMERA_IN_USE" : i == 2 ? "ERROR_CAMERA_LIMIT_EXCEEDED" : i == 3 ? "ERROR_CAMERA_DISABLED" : i == 4 ? "ERROR_CAMERA_DEVICE" : i == 5 ? "ERROR_CAMERA_SERVICE" : i == 6 ? "ERROR_CAMERA_DISCONNECTED" : i == 7 ? "ERROR_ILLEGAL_ARGUMENT_EXCEPTION" : i == 8 ? "ERROR_SECURITY_EXCEPTION" : i == 9 ? "ERROR_GRAPH_CONFIG" : i == 10 ? "ERROR_DO_NOT_DISTURB_ENABLED" : i == 11 ? "ERROR_UNKNOWN_EXCEPTION" : i == 12 ? "ERROR_CAMERA_OPENER" : i == 13 ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN", ')');
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IIlOloloOil) && this.I00000oIO == ((IIlOloloOil) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }
