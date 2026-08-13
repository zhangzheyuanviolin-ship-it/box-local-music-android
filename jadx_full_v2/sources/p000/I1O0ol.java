            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.os.Binder;
            import android.os.Process;
            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.io.IOException;
            import java.net.URLConnection;
            
            public final class I1O0ol {
                public Context I00000oIO;

                public I1O0ol(Context context) {
/* 4 */             this.I00000oIO = context;
                }

                public static String I00000oOI(File file) throws IOException {
/* 1 */             String canonicalPath = file.getCanonicalPath();
                    return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static String I0000O(String str) {
/* 1 */             String str2 = null;
/* 2 */             if (str != null) {
/* 6 */                 String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
/* 10 */                if (strGuessContentTypeFromName == null) {
/* 15 */                    char c = '.';
/* 17 */                    int iLastIndexOf = str.lastIndexOf(46);
/* 22 */                    if (iLastIndexOf != -1) {
/* 32 */                        String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
/* 36 */                        lowerCase.getClass();
                                switch (lowerCase.hashCode()) {
                                    case 3315:
/* 713 */                               if (!lowerCase.equals("gz")) {
/* 46 */                                    c = 65535;
                                            break;
                                        } else {
/* 717 */                                   c = 0;
                                            break;
                                        }
                                    case 3401:
/* 701 */                               if (lowerCase.equals("js")) {
/* 705 */                                   c = 1;
                                            break;
                                        }
                                        break;
                                    case 97669:
/* 689 */                               if (lowerCase.equals("bmp")) {
/* 693 */                                   c = 2;
                                            break;
                                        }
                                        break;
                                    case 98819:
/* 677 */                               if (lowerCase.equals("css")) {
/* 681 */                                   c = 3;
                                            break;
                                        }
                                        break;
                                    case 102340:
/* 665 */                               if (lowerCase.equals("gif")) {
/* 669 */                                   c = 4;
                                            break;
                                        }
                                        break;
                                    case 103649:
/* 653 */                               if (lowerCase.equals("htm")) {
/* 657 */                                   c = 5;
                                            break;
                                        }
                                        break;
                                    case 104085:
/* 641 */                               if (lowerCase.equals("ico")) {
/* 645 */                                   c = 6;
                                            break;
                                        }
                                        break;
                                    case 105441:
/* 629 */                               if (lowerCase.equals("jpg")) {
/* 633 */                                   c = 7;
                                            break;
                                        }
                                        break;
                                    case 106458:
/* 615 */                               if (lowerCase.equals("m4a")) {
/* 619 */                                   c = '\b';
                                            break;
                                        }
                                        break;
                                    case 106479:
/* 601 */                               if (lowerCase.equals("m4v")) {
/* 605 */                                   c = '\t';
                                            break;
                                        }
                                        break;
                                    case 108089:
/* 587 */                               if (lowerCase.equals("mht")) {
/* 591 */                                   c = '\n';
                                            break;
                                        }
                                        break;
                                    case 108150:
/* 573 */                               if (lowerCase.equals("mjs")) {
/* 577 */                                   c = 11;
                                            break;
                                        }
                                        break;
                                    case 108272:
/* 559 */                               if (lowerCase.equals("mp3")) {
/* 563 */                                   c = '\f';
                                            break;
                                        }
                                        break;
                                    case 108273:
/* 545 */                               if (lowerCase.equals("mp4")) {
/* 549 */                                   c = '\r';
                                            break;
                                        }
                                        break;
                                    case 108324:
/* 531 */                               if (lowerCase.equals("mpg")) {
/* 535 */                                   c = 14;
                                            break;
                                        }
                                        break;
                                    case 109961:
/* 517 */                               if (lowerCase.equals("oga")) {
/* 521 */                                   c = 15;
                                            break;
                                        }
                                        break;
                                    case 109967:
/* 503 */                               if (lowerCase.equals("ogg")) {
/* 507 */                                   c = 16;
                                            break;
                                        }
                                        break;
                                    case 109973:
/* 489 */                               if (lowerCase.equals("ogm")) {
/* 493 */                                   c = 17;
                                            break;
                                        }
                                        break;
                                    case 109982:
/* 475 */                               if (lowerCase.equals("ogv")) {
/* 479 */                                   c = 18;
                                            break;
                                        }
                                        break;
                                    case 110834:
/* 461 */                               if (lowerCase.equals("pdf")) {
/* 465 */                                   c = 19;
                                            break;
                                        }
                                        break;
                                    case 111030:
/* 447 */                               if (lowerCase.equals("pjp")) {
/* 451 */                                   c = 20;
                                            break;
                                        }
                                        break;
                                    case 111145:
/* 433 */                               if (lowerCase.equals("png")) {
/* 437 */                                   c = 21;
                                            break;
                                        }
                                        break;
                                    case 114276:
/* 419 */                               if (lowerCase.equals("svg")) {
/* 423 */                                   c = 22;
                                            break;
                                        }
                                        break;
                                    case 114791:
/* 405 */                               if (lowerCase.equals("tgz")) {
/* 409 */                                   c = 23;
                                            break;
                                        }
                                        break;
                                    case 114833:
/* 391 */                               if (lowerCase.equals("tif")) {
/* 395 */                                   c = 24;
                                            break;
                                        }
                                        break;
                                    case 117484:
/* 377 */                               if (lowerCase.equals("wav")) {
/* 381 */                                   c = 25;
                                            break;
                                        }
                                        break;
                                    case 118660:
/* 363 */                               if (lowerCase.equals("xht")) {
/* 367 */                                   c = 26;
                                            break;
                                        }
                                        break;
                                    case 118807:
/* 349 */                               if (lowerCase.equals("xml")) {
/* 353 */                                   c = 27;
                                            break;
                                        }
                                        break;
                                    case 120609:
/* 335 */                               if (lowerCase.equals("zip")) {
/* 339 */                                   c = 28;
                                            break;
                                        }
                                        break;
                                    case 3000872:
/* 321 */                               if (lowerCase.equals("apng")) {
/* 325 */                                   c = 29;
                                            break;
                                        }
                                        break;
                                    case 3145576:
/* 307 */                               if (lowerCase.equals("flac")) {
/* 311 */                                   c = 30;
                                            break;
                                        }
                                        break;
                                    case 3213227:
/* 293 */                               if (lowerCase.equals("html")) {
/* 297 */                                   c = 31;
                                            break;
                                        }
                                        break;
                                    case 3259225:
/* 279 */                               if (lowerCase.equals("jfif")) {
/* 283 */                                   c = ' ';
                                            break;
                                        }
                                        break;
                                    case 3268712:
/* 265 */                               if (lowerCase.equals("jpeg")) {
/* 269 */                                   c = '!';
                                            break;
                                        }
                                        break;
                                    case 3271912:
/* 251 */                               if (lowerCase.equals("json")) {
/* 255 */                                   c = '\"';
                                            break;
                                        }
                                        break;
                                    case 3358085:
/* 237 */                               if (lowerCase.equals("mpeg")) {
/* 241 */                                   c = '#';
                                            break;
                                        }
                                        break;
                                    case 3418175:
/* 223 */                               if (lowerCase.equals("opus")) {
/* 227 */                                   c = '$';
                                            break;
                                        }
                                        break;
                                    case 3529614:
/* 209 */                               if (lowerCase.equals("shtm")) {
/* 213 */                                   c = '%';
                                            break;
                                        }
                                        break;
                                    case 3542678:
/* 195 */                               if (lowerCase.equals("svgz")) {
/* 199 */                                   c = '&';
                                            break;
                                        }
                                        break;
                                    case 3559925:
/* 181 */                               if (lowerCase.equals("tiff")) {
/* 185 */                                   c = '\'';
                                            break;
                                        }
                                        break;
                                    case 3642020:
/* 168 */                               if (lowerCase.equals("wasm")) {
/* 171 */                                   c = '(';
                                            break;
                                        }
                                        break;
                                    case 3645337:
/* 155 */                               if (lowerCase.equals("webm")) {
/* 158 */                                   c = ')';
                                            break;
                                        }
                                        break;
                                    case 3645340:
/* 142 */                               if (lowerCase.equals("webp")) {
/* 145 */                                   c = '*';
                                            break;
                                        }
                                        break;
                                    case 3655064:
/* 129 */                               if (lowerCase.equals("woff")) {
/* 132 */                                   c = '+';
                                            break;
                                        }
                                        break;
                                    case 3678569:
/* 116 */                               if (lowerCase.equals("xhtm")) {
/* 119 */                                   c = ',';
                                            break;
                                        }
                                        break;
                                    case 96488848:
/* 103 */                               if (lowerCase.equals("ehtml")) {
/* 106 */                                   c = '-';
                                            break;
                                        }
                                        break;
                                    case 103877016:
/* 94 */                                if (!lowerCase.equals("mhtml")) {
                                        }
                                        break;
                                    case 106703064:
/* 81 */                                if (lowerCase.equals("pjpeg")) {
/* 84 */                                    c = '/';
                                            break;
                                        }
                                        break;
                                    case 109418142:
/* 68 */                                if (lowerCase.equals("shtml")) {
/* 71 */                                    c = '0';
                                            break;
                                        }
                                        break;
                                    case 114035747:
/* 55 */                                if (lowerCase.equals("xhtml")) {
/* 58 */                                    c = '1';
                                            break;
                                        }
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                    case PoseLandmark.LEFT_HIP:
/* 814 */                               str2 = "application/gzip";
                                        break;
                                    case 1:
                                    case 11:
/* 811 */                               str2 = "text/javascript";
                                        break;
                                    case 2:
/* 808 */                               str2 = "image/bmp";
                                        break;
                                    case 3:
/* 805 */                               str2 = "text/css";
                                        break;
                                    case 4:
/* 802 */                               str2 = "image/gif";
                                        break;
                                    case 5:
                                    case PoseLandmark.LEFT_FOOT_INDEX:
                                    case '%':
                                    case BuildConfig.VERSION_CODE:
                                    case '0':
/* 799 */                               str2 = "text/html";
                                        break;
                                    case 6:
/* 796 */                               str2 = "image/x-icon";
                                        break;
                                    case 7:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case ' ':
                                    case '!':
                                    case '/':
/* 793 */                               str2 = "image/jpeg";
                                        break;
                                    case '\b':
/* 790 */                               str2 = "audio/x-m4a";
                                        break;
                                    case '\t':
                                    case '\r':
/* 787 */                               str2 = "video/mp4";
                                        break;
                                    case '\n':
                                    case '.':
/* 784 */                               str2 = "multipart/related";
                                        break;
                                    case '\f':
/* 781 */                               str2 = "audio/mpeg";
                                        break;
                                    case 14:
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 778 */                               str2 = "video/mpeg";
                                        break;
                                    case 15:
                                    case 16:
                                    case '$':
/* 775 */                               str2 = "audio/ogg";
                                        break;
                                    case 17:
                                    case PoseLandmark.RIGHT_PINKY:
/* 772 */                               str2 = "video/ogg";
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 769 */                               str2 = "application/pdf";
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 766 */                               str2 = "image/png";
                                        break;
                                    case PoseLandmark.RIGHT_THUMB:
                                    case '&':
/* 763 */                               str2 = "image/svg+xml";
                                        break;
                                    case PoseLandmark.RIGHT_HIP:
                                    case '\'':
/* 760 */                               str2 = "image/tiff";
                                        break;
                                    case PoseLandmark.LEFT_KNEE:
/* 757 */                               str2 = "audio/wav";
                                        break;
                                    case PoseLandmark.RIGHT_KNEE:
                                    case ',':
                                    case '1':
/* 754 */                               str2 = "application/xhtml+xml";
                                        break;
                                    case 27:
/* 751 */                               str2 = "text/xml";
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 748 */                               str2 = "application/zip";
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 745 */                               str2 = "image/apng";
                                        break;
                                    case 30:
/* 742 */                               str2 = "audio/flac";
                                        break;
                                    case '\"':
/* 739 */                               str2 = "application/json";
                                        break;
                                    case '(':
/* 735 */                               str2 = "application/wasm";
                                        break;
                                    case ')':
/* 731 */                               str2 = "video/webm";
                                        break;
                                    case '*':
/* 727 */                               str2 = "image/webp";
                                        break;
                                    case '+':
/* 723 */                               str2 = "application/font-woff";
                                        break;
                                }
                            }
                        } else {
/* 12 */                    str2 = strGuessContentTypeFromName;
                        }
                    }
                    return str2 == null ? "text/plain" : str2;
                }

                public ApplicationInfo I00000oIO(int i, String str) {
/* 7 */             return this.I00000oIO.getPackageManager().getApplicationInfo(str, i);
                }

                public PackageInfo I0000Il00O(int i, String str) {
/* 7 */             return this.I00000oIO.getPackageManager().getPackageInfo(str, i);
                }

                public boolean I0000oI00() {
/* 1 */             int callingUid = Binder.getCallingUid();
/* 5 */             int iMyUid = Process.myUid();
/* 9 */             Context context = this.I00000oIO;
/* 11 */            if (callingUid == iMyUid) {
/* 13 */                return Ioo1l1i00O.I00000oIO(context);
                    }
/* 26 */            String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
/* 30 */            if (nameForUid != null) {
/* 36 */                return context.getPackageManager().isInstantApp(nameForUid);
                    }
/* 41 */            return false;
                }
            }
