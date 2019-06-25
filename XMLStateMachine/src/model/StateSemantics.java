/***********************************************************************
 * Module:  StateSemantics.java
 * Author:  Vladimir
 * Purpose: Defines the Class StateSemantics
 ***********************************************************************/

package model;

public enum StateSemantics {
	Init {
		@Override
		public String toString() {
			return "Init";
		}
	},
	SaveEnabled {
		@Override
		public String toString() {
			return "SaveEnabled";
		}
	},
	DeleteEnabled {
		@Override
		public String toString() {
			return "DeleteEnabled";
		}
	},
	Submited {
		@Override
		public String toString() {
			return "Submited";
		}
	},
	Simulate {
		@Override
		public String toString() {
			return "Simulate";
		}
	},
	Published {
		@Override
		public String toString() {
			return "Published";
		}
	},
	Returned {
		@Override
		public String toString() {
			return "Returned";
		}
	},
	Final {
		@Override
		public String toString() {
			return "Final";
		}
	},
	Rejected {
		@Override
		public String toString() {
			return "Rejected";
		}
	},
	Approved {
		@Override
		public String toString() {
			return "Approved";
		}
	},
	Archived {
		@Override
		public String toString() {
			return "Archived";
		}
	};

}