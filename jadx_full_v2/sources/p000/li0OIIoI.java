            package p000;

            import java.math.BigDecimal;
            import java.time.Duration;
            import java.time.temporal.ChronoUnit;
            
            public abstract class li0OIIoI {
                public static final Duration I00000oIO = Duration.ofSeconds(Long.MIN_VALUE);
                public static final Duration I00000oOI = Duration.ofSeconds(Long.MAX_VALUE, 999999999);

                static {
/* 23 */            Duration.ofMillis(Long.MAX_VALUE);
/* 26 */            Duration.ofMillis(Long.MIN_VALUE);
/* 29 */            ChronoUnit chronoUnit = ChronoUnit.MICROS;
/* 31 */            Duration.of(Long.MAX_VALUE, chronoUnit);
/* 34 */            Duration.of(Long.MIN_VALUE, chronoUnit);
/* 37 */            Duration.ofNanos(Long.MAX_VALUE);
/* 40 */            Duration.ofNanos(Long.MIN_VALUE);
/* 45 */            BigDecimal.valueOf(9.223372036854776E18d);
/* 50 */            BigDecimal.valueOf(-9.223372036854776E18d);
/* 60 */            Duration.ofMillis(Long.MAX_VALUE).plusNanos(999999L);
                }
            }
