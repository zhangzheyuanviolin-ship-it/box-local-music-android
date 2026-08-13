            package net.zetetic.database.sqlcipher;
            
            public class DatabaseObjectNotClosedException extends RuntimeException {
                public DatabaseObjectNotClosedException() {
/* 3 */             super("Application did not close the cursor or database object that was opened here");
                }
            }
