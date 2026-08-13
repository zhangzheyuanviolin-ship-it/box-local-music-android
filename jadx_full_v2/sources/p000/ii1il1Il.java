            package p000;

            import java.util.HashMap;
            
            public enum ii1il1Il {
                ADD(0),
                AND(1),
                APPLY(2),
                ASSIGN(3),
                BITWISE_AND(56),
                BITWISE_LEFT_SHIFT(57),
                BITWISE_NOT(58),
                BITWISE_OR(59),
                BITWISE_RIGHT_SHIFT(60),
                BITWISE_UNSIGNED_RIGHT_SHIFT(61),
                BITWISE_XOR(62),
                BLOCK(53),
                BREAK(4),
                CASE(5),
                CONST(52),
                CONTINUE(6),
                CONTROL(49),
                CREATE_ARRAY(7),
                CREATE_OBJECT(8),
                DEFAULT(9),
                DEFINE_FUNCTION(50),
                DIVIDE(10),
                DO(11),
                EQUALS(12),
                EXPRESSION_LIST(13),
                FN(51),
                FOR_IN(47),
                FOR_IN_CONST(54),
                FOR_IN_LET(55),
                FOR_LET(63),
                FOR_OF(64),
                FOR_OF_CONST(65),
                FOR_OF_LET(66),
                GET(15),
                PLUS_EQUALS(48),
                GET_INDEX(16),
                GET_PROPERTY(17),
                GREATER_THAN(18),
                GREATER_THAN_EQUALS(19),
                IDENTITY_EQUALS(20),
                IDENTITY_NOT_EQUALS(21),
                IF(22),
                LESS_THAN(23),
                LESS_THAN_EQUALS(24),
                MODULUS(25),
                MULTIPLY(26),
                NEGATE(27),
                NOT(28),
                NOT_EQUALS(29),
                NULL(45),
                OR(30),
                PLUS_EQUALS(31),
                POST_DECREMENT(32),
                POST_INCREMENT(33),
                QUOTE(46),
                PRE_DECREMENT(34),
                PRE_INCREMENT(35),
                RETURN(36),
                SET_PROPERTY(43),
                SUBTRACT(37),
                SWITCH(38),
                TERNARY(39),
                TYPEOF(40),
                UNDEFINED(44),
                VAR(41),
                WHILE(42);

                public static final HashMap I01I0Iioooo0 = new HashMap();
                public final int I00iOIl;

                static {
/* 1059 */          for (ii1il1Il ii1il1il : values()) {
/* 1071 */              I01I0Iioooo0.put(Integer.valueOf(ii1il1il.I00iOIl), ii1il1il);
                    }
                }

                ii1il1Il(int i) {
/* 4 */             this.I00iOIl = i;
                }

                @Override
                public final String toString() {
/* 7 */             return Integer.valueOf(this.I00iOIl).toString();
                }
            }
