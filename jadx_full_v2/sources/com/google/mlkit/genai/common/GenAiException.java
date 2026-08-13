            package com.google.mlkit.genai.common;

            import java.time.Duration;
            
/* 169 */   public class GenAiException extends Exception {
                private final int zza;
                private final Duration zzb;

                public @interface ErrorCode {
                    public static final int AICORE_INCOMPATIBLE = -101;
                    public static final int AUDIO_BUFFER_OVERFLOW = -107;
                    public static final int BACKGROUND_USE_BLOCKED = 30;
                    public static final int BUSY = 9;
                    public static final int CACHE_PROCESSING_ERROR = -103;
                    public static final int CANCELLED = 7;
                    public static final int INVALID_INPUT_IMAGE = -102;
                    public static final int NEEDS_SYSTEM_UPDATE = 604;
                    public static final int NOT_AVAILABLE = 8;
                    public static final int NOT_ENOUGH_DISK_SPACE = 501;
                    public static final int NOT_SUPPORTED = 16;
                    public static final int PER_APP_BATTERY_USE_QUOTA_EXCEEDED = 27;
                    public static final int REQUEST_PROCESSING_ERROR = 4;
                    public static final int REQUEST_TOO_LARGE = 12;
                    public static final int REQUEST_TOO_SMALL = -100;
                    public static final int RESPONSE_GENERATION_ERROR = 15;
                    public static final int RESPONSE_PROCESSING_ERROR = 11;
                    public static final int STRUCTURED_OUTPUT_MAX_TOKENS_ERROR = -106;
                    public static final int STRUCTURED_OUTPUT_REQUEST_ERROR = -104;
                    public static final int STRUCTURED_OUTPUT_RESPONSE_ERROR = -105;
                    public static final int UNKNOWN = 0;
                }

                public GenAiException(Throwable th, int i, Duration duration) {
                    String message;
/* 3 */             if (i == -107) {
/* 120 */               message = "Audio buffer overflow. The audio input rate is too fast.";
                    } else if (i == 4) {
/* 117 */               message = "Request doesn't pass certain policy check. Please try a different input.";
                    } else if (i == 30) {
/* 114 */               message = "Background usage is blocked. Please use the API when your app is in the foreground instead.";
                    } else if (i == 501) {
/* 111 */               message = "Not enough storage. Please clear some space.";
                    } else if (i == 604) {
/* 108 */               message = "Android version is too low. Please update.";
                    } else if (i == 7) {
/* 105 */               message = "The request is canceled.";
                    } else if (i == 8) {
/* 102 */               message = "This feature is not available on this device. It is due to either the device not supporting it or the latest configuration file has not been downloaded.";
                    } else if (i == 9) {
/* 99 */                message = "Request cannot be processed. Either your app is out of usage quota (try again later) or the request is from disallowed background usage (use the API while the app is in the foreground).";
                    } else if (i == 11) {
/* 96 */                message = "Generated response doesn't pass certain policy check. Please try a different input.";
                    } else if (i == 12) {
/* 93 */                message = "Request too large. Please shorten your input.";
                    } else if (i == 15) {
/* 90 */                message = "Couldn't generate a response due to policy check failure. Please try a different input.";
                    } else if (i == 16) {
/* 87 */                message = "This functionality is not implemented nor supported by the inference engine.";
                    } else if (i == 27) {
/* 84 */                message = "A long-duration (for example per-day) quota for the calling app's uid has been exceeded. Use of AICore from this app has been restricted to preserve battery.";
                    } else if (i != 28) {
                        switch (i) {
                            case ErrorCode.INVALID_INPUT_IMAGE:
/* 78 */                        message = "Invalid input image. It can be due to invalid image URL, failure to decode to bitmap, invalid mime type or other image processing failures.";
                                break;
                            case ErrorCode.AICORE_INCOMPATIBLE:
/* 75 */                        message = "AICore is either not installed or the installed version is too low.";
                                break;
                            case -100:
/* 72 */                        message = "Request too small. Please provide a longer input.";
                                break;
                            default:
/* 58 */                        if (th == null) {
/* 69 */                            message = "Unknown error.";
                                    break;
                                } else {
/* 60 */                            message = th.getMessage();
/* 64 */                            if (message == null) {
/* 66 */                                message = "";
                                        break;
                                    }
                                }
                                break;
                        }
                    } else {
/* 81 */                message = "A long-duration (for example per-day) quota for the device has been exceeded. Use of AICore (from any app) has been restricted to preserve battery.";
                    }
/* 139 */           StringBuilder sb = new StringBuilder(message.length() + String.valueOf(i).length() + 13);
/* 144 */           sb.append("[ErrorCode ");
/* 147 */           sb.append(i);
/* 152 */           sb.append("] ");
/* 155 */           sb.append(message);
/* 162 */           super(sb.toString(), th);
/* 165 */           this.zza = i;
/* 167 */           this.zzb = duration;
                }

                public int getErrorCode() {
/* 1 */             int i = this.zza;
/* 5 */             if (i == 28) {
/* 7 */                 return 9;
                    }
/* 20 */            return i;
                }

                public Duration getRetryDelay() {
/* 1 */             return this.zzb;
                }

/* 170 */       public GenAiException(String str, Throwable th, int i, Duration duration) {
/* 171 */           super(str, th);
                    this.zza = i;
                    this.zzb = duration;
                }

/* 171 */       public GenAiException(Throwable th, int i) {
/* 172 */           this(th, i, Duration.ZERO);
                }

/* 172 */       public GenAiException(String str, Throwable th, int i) {
/* 173 */           this(str, th, i, Duration.ZERO);
                }
            }
