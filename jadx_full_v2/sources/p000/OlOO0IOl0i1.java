            package p000;

            import java.io.IOException;
            
            public final class OlOO0IOl0i1 extends IOException {
                public final int I00iOIl;

                /* JADX WARN: Illegal instructions before constructor call */
                public OlOO0IOl0i1(int i) {
                    String str;
                    switch (i) {
                        case 1:
/* 46 */                    str = "NO_ERROR";
                            break;
                        case 2:
/* 43 */                    str = "PROTOCOL_ERROR";
                            break;
                        case 3:
/* 40 */                    str = "INTERNAL_ERROR";
                            break;
                        case 4:
/* 37 */                    str = "FLOW_CONTROL_ERROR";
                            break;
                        case 5:
/* 34 */                    str = "SETTINGS_TIMEOUT";
                            break;
                        case 6:
/* 31 */                    str = "STREAM_CLOSED";
                            break;
                        case 7:
/* 28 */                    str = "FRAME_SIZE_ERROR";
                            break;
                        case 8:
/* 25 */                    str = "REFUSED_STREAM";
                            break;
                        case 9:
/* 22 */                    str = "CANCEL";
                            break;
                        case 10:
/* 19 */                    str = "COMPRESSION_ERROR";
                            break;
                        case 11:
/* 16 */                    str = "CONNECT_ERROR";
                            break;
                        case 12:
/* 13 */                    str = "ENHANCE_YOUR_CALM";
                            break;
                        case 13:
/* 10 */                    str = "INADEQUATE_SECURITY";
                            break;
                        case 14:
/* 7 */                     str = "HTTP_1_1_REQUIRED";
                            break;
                        default:
/* 4 */                     str = "null";
                            break;
                    }
/* 54 */            super("stream was reset: ".concat(str));
/* 57 */            this.I00iOIl = i;
                }
            }
