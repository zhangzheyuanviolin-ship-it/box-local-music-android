            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/ai/edge/litertlm/LogSeverity;", "", "severity", "", "<init>", "(Ljava/lang/String;II)V", "getSeverity", "()I", "VERBOSE", "DEBUG", "INFO", "WARNING", "ERROR", "FATAL", "INFINITY", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class LogSeverity {
                private static final Il0lIli0 $ENTRIES;
                private static final LogSeverity[] $VALUES;
                private final int severity;
                public static final LogSeverity VERBOSE = new LogSeverity("VERBOSE", 0, 0);
                public static final LogSeverity DEBUG = new LogSeverity("DEBUG", 1, 1);
                public static final LogSeverity INFO = new LogSeverity("INFO", 2, 2);
                public static final LogSeverity WARNING = new LogSeverity("WARNING", 3, 3);
                public static final LogSeverity ERROR = new LogSeverity("ERROR", 4, 4);
                public static final LogSeverity FATAL = new LogSeverity("FATAL", 5, 5);
                public static final LogSeverity INFINITY = new LogSeverity("INFINITY", 6, 1000);

                private static final LogSeverity[] $values() {
/* 15 */            return new LogSeverity[]{VERBOSE, DEBUG, INFO, WARNING, ERROR, FATAL, INFINITY};
                }

                static {
/* 73 */            LogSeverity[] logSeverityArr$values = $values();
/* 77 */            $VALUES = logSeverityArr$values;
/* 83 */            $ENTRIES = ilIII1o11.I00000oIO(logSeverityArr$values);
                }

                private LogSeverity(String str, int i, int i2) {
/* 4 */             this.severity = i2;
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static LogSeverity valueOf(String str) {
/* 7 */             return (LogSeverity) Enum.valueOf(LogSeverity.class, str);
                }

                public static LogSeverity[] values() {
/* 7 */             return (LogSeverity[]) $VALUES.clone();
                }

                public final int getSeverity() {
/* 1 */             return this.severity;
                }
            }
