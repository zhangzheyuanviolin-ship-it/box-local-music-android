            package p000;
            
            public final class OiO1o1il0 extends Io00Ol1o10O {
                public static final int CHANNEL_ID_FIELD_NUMBER = 4;
                public static final int CHANNEL_NAME_FIELD_NUMBER = 5;
                public static final int DAY_FIELD_NUMBER = 10;
                public static final int DEEPLINK_FIELD_NUMBER = 12;
                private static final OiO1o1il0 DEFAULT_INSTANCE;
                public static final int HOUR_FIELD_NUMBER = 6;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int MESSAGE_FIELD_NUMBER = 3;
                public static final int MINUTE_FIELD_NUMBER = 7;
                public static final int MONTH_FIELD_NUMBER = 9;
                private static volatile OO01IIIl0oO PARSER = null;
                public static final int REPEAT_DAILY_FIELD_NUMBER = 11;
                public static final int TITLE_FIELD_NUMBER = 2;
                public static final int YEAR_FIELD_NUMBER = 8;
                private int bitField0_;
                private int day_;
                private int hour_;
                private int minute_;
                private int month_;
                private boolean repeatDaily_;
                private int year_;
                private String id_ = "";
                private String title_ = "";
                private String message_ = "";
                private String channelId_ = "";
                private String channelName_ = "";
                private String deeplink_ = "";

                static {
/* 3 */             OiO1o1il0 oiO1o1il0 = new OiO1o1il0();
/* 6 */             DEFAULT_INSTANCE = oiO1o1il0;
/* 10 */            Io00Ol1o10O.I000oI1ioi(OiO1o1il0.class, oiO1o1il0);
                }

                public static OiO1ll11l I00IO1oi11O() {
/* 7 */             return (OiO1ll11l) DEFAULT_INSTANCE.I0000O();
                }

                @Override
                public final Object I0000oI00(int i) {
                    OO01IIIl0oO io000O;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 100 */                   return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 93 */                    return Io00Ol1o10O.I000l1(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007\u0004\bင\u0000\tင\u0001\nင\u0002\u000bဇ\u0003\fለ\u0004", new Object[]{"bitField0_", "id_", "title_", "message_", "channelId_", "channelName_", "hour_", "minute_", "year_", "month_", "day_", "repeatDaily_", "deeplink_"});
                        case 3:
/* 55 */                    return new OiO1o1il0();
                        case 4:
/* 49 */                    return new OiO1ll11l(DEFAULT_INSTANCE);
                        case 5:
/* 42 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIIl0oO oO01IIIl0oO = PARSER;
/* 15 */                    if (oO01IIIl0oO != null) {
/* 41 */                        return oO01IIIl0oO;
                            }
                            synchronized (OiO1o1il0.class) {
                                try {
/* 20 */                            io000O = PARSER;
/* 22 */                            if (io000O == null) {
/* 28 */                                io000O = new Io000O(DEFAULT_INSTANCE);
/* 31 */                                PARSER = io000O;
                                    }
                                } catch (Throwable th) {
/* 40 */                            throw th;
                                }
                            }
/* 38 */                    return io000O;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }

                public final String I0010I0i() {
/* 1 */             return this.channelId_;
                }

                public final String I0010o() {
/* 1 */             return this.channelName_;
                }

                public final int I00111O() {
/* 1 */             return this.day_;
                }

                public final String I001IIilI0O() {
/* 1 */             return this.deeplink_;
                }

                public final int I001IO000() {
/* 1 */             return this.hour_;
                }

                public final String I001i1O0Ol() {
/* 1 */             return this.id_;
                }

                public final String I001i1lo1io() {
/* 1 */             return this.message_;
                }

                public final int I001iOo1i0O() {
/* 1 */             return this.minute_;
                }

                public final int I001l0I00() {
/* 1 */             return this.month_;
                }

                public final boolean I001lIiIIo1O() {
/* 1 */             return this.repeatDaily_;
                }

                public final String I001lllioOl() {
/* 1 */             return this.title_;
                }

                public final int I001lloI() {
/* 1 */             return this.year_;
                }

                public final boolean I00II0Ol1O0l() {
                    return (this.bitField0_ & 4) != 0;
                }

                public final boolean I00II0oii1o() {
                    return (this.bitField0_ & 2) != 0;
                }

                public final boolean I00IO1() {
                    return (this.bitField0_ & 1) != 0;
                }

                public final void I00IOO() {
/* 3 */             this.channelId_ = "agent_skill_tasks_channel";
                }

                public final void I00IioO0OiOi() {
/* 3 */             this.channelName_ = "Agent Skill Task";
                }

                public final void I00IlilI0i0i(int i) {
                    this.bitField0_ |= 4;
/* 7 */             this.day_ = i;
                }

                public final void I00Io1lO(String str) {
/* 1 */             str.getClass();
                    this.bitField0_ |= 16;
/* 10 */            this.deeplink_ = str;
                }

                public final void I00Io1o110i(int i) {
/* 1 */             this.hour_ = i;
                }

                public final void I00IoIO0lI(String str) {
/* 1 */             str.getClass();
/* 4 */             this.id_ = str;
                }

                public final void I00IoO0(String str) {
/* 1 */             str.getClass();
/* 4 */             this.message_ = str;
                }

                public final void I00IoiI(int i) {
/* 1 */             this.minute_ = i;
                }

                public final void I00Iooi00oi(int i) {
                    this.bitField0_ |= 2;
/* 7 */             this.month_ = i;
                }

                public final void I00O0i0ii(boolean z) {
                    this.bitField0_ |= 8;
/* 7 */             this.repeatDaily_ = z;
                }

                public final void I00O0o1oo(String str) {
/* 1 */             str.getClass();
/* 4 */             this.title_ = str;
                }

                public final void I00O10llo(int i) {
                    this.bitField0_ |= 1;
/* 7 */             this.year_ = i;
                }
            }
