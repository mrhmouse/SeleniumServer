package hall.caleb.selenium.objects.response;

import java.util.List;
import java.util.UUID;

import hall.caleb.selenium.enums.ResponseType;

public class MultiResultResponse extends Response {
	private List<String> results;
	
	public MultiResultResponse() {
		super();
		this.type = ResponseType.MultiResult;
	}

	public MultiResultResponse(UUID id) {
		super(id, ResponseType.MultiResult);
	}
	
	public MultiResultResponse(UUID id, boolean success) {
		super(id, success, ResponseType.MultiResult);
	}

	@Override
	public String toString() {
		return "MultiResultResponse [results=" + results + ", id=" + id + ", success=" + success + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((results == null) ? 0 : results.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MultiResultResponse other = (MultiResultResponse) obj;
		if (results == null) {
			if (other.results != null)
				return false;
		} else if (!results.equals(other.results))
			return false;
		return true;
	}

	public List<String> getResults() {
		return results;
	}

	public void setResults(List<String> results) {
		this.results = results;
	}
}
